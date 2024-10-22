<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function getJung(daecode) {
		document.pform.so.options.length=1;
		var jungSelect = document.getElementById("jung");
	    while (jungSelect.options.length > 1) {
	        jungSelect.remove(1);
	    }
	    
		var chk=new XMLHttpRequest();
		chk.onload=function() {
			var jungAll=JSON.parse(chk.responseText);
			for(jung of jungAll) {
				var addOption=document.createElement("option");
				addOption.value=jung.code;
				addOption.innerText=jung.name;
				jungSelect.appendChild(addOption);
				getPcode();
			}
		}
		chk.open("get","getJung?daecode="+daecode);
		chk.send();
		getPcode();
	}
	
	function getSo(code) {
		var dae=document.pform.dae.value;
		var jung=code;
		var daejung=String(dae+jung);
		
		
		var soSelect=document.pform.so;
		while(soSelect.options.length>1) {
			soSelect.remove(1);
		}
		
		var chk1=new XMLHttpRequest();
		chk1.onload=function() {
			var soAll=JSON.parse(chk1.responseText);
			for(so of soAll) {
				var addSo=document.createElement("option");
				addSo.value=so.code;
				addSo.innerText=so.name;
				soSelect.appendChild(addSo);
				getPcode();
			}
		}
		chk1.open("get","getSo?daejung="+daejung);
		chk1.send();
		getPcode();
	}
	
	function getPcode() {
		
		var dae=document.pform.dae.value;
		var jung=document.pform.jung.value;
		var so=document.pform.so.value;
		var com=document.pform.company.value;
		var pcode="p"+dae+jung+so+com;
		
		var chk=new XMLHttpRequest();
		chk.onload=function() {
			if(dae=='선택' || jung=='선택' || so=='선택' || com=='선택') {
				document.pform.pcode.value='상품을 분류 해주세요';
			} else {
				document.pform.pcode.value=chk.responseText;
				
			}
		}
		chk.open("get","getPcode?pcode="+pcode);
		chk.send();
	}
	
	function chk() {
		var dae=document.pform.dae.value;
		var jung=document.pform.jung.value;
		var so=document.pform.jung.value;
		
		if(dae=='선택' || jung=='선택' || so=='선택'){
			alert("상품코드를 입력해주세요");
			return false;
		} else {
			return true;
		}
	}
	
	function chg(n) {
		var files=event.target.files;
		document.getElementById("pimgPre"+n).innerHTML="";
		Array.from(files).forEach(file => {
			if(file.type.startsWith("image")) {
				var reader=new FileReader();
				reader.onload=function(e) {
					var addImg=document.createElement("img");
					addImg.src=e.target.result;
					addImg.style.maxWidth="200px";
					addImg.style.margin="10px";
					document.getElementById("pimgPre"+n).appendChild(addImg);
				}
				reader.readAsDataURL(file);
			}
		})
	}
	
	function numChk(my) {
		my.value=my.value.replace(/[^0-9]/g,"");
	}
</script>
</head>
<body>
   <section>
     <form name="pform" method="post" action="productAddOk" enctype="multipart/form-data" onsubmit="return chk()">
       <table width="800" align="center">
     
         <caption> <h3> 상품 등록 </h3></caption>
         <tr>
           <td> 상품코드 </td>
           <td> 
           	<input type="text" name="pcode" value="상품을 분류 해주세요" readonly>
			<select name="dae" onchange="getJung(this.value)">
				<option>선택</option>
				<c:forEach var="dae" items="${daeAll}">
					<option value="${dae.code}">${dae.name}</option>
				</c:forEach>
			</select>
			<select name="jung" id="jung" onchange="getSo(this.value)">
				<option>선택</option>
			</select>
			<select name="so" onchange="getPcode()">
				<option>선택</option>
			</select>
			<select name="company"onchange="getPcode()">
				<c:forEach var="company" items="${companyAll }">
					<option value="${company.code}">${company.name }</option>
				</c:forEach>
			</select>
			<input type="button" onclick="getPcode()" value="상품코드 생성">
		   </td>
         </tr>
         <tr>
           <td> 상품이미지 </td>
           <td> <input type="file" name="pimg1" id="pimgInput" onchange="chg(1)" multiple>
           	<div id="pimgPre1"></div>
           </td>
         </tr>
         <tr>
           <td> 상품상세정보 </td>
           <td> <input type="file" name="dimg1" onchange="chg(2)" multiple> 
           	<div id="pimgPre2"></div>
           </td>
         </tr>
         <tr>
           <td> 상품명 </td>
           <td> <input type="text" name="title"> </td>
         </tr>
         <tr>
           <td> 상품가격 </td>
           <td> <input type="text" name="price" onkeyup="numChk(this)"> </td>
         </tr>
         <tr>
           <td> 상품할인율 </td>
           <td> <input type="text" name="halin" onkeyup="numChk(this)"> </td>
         </tr>
         <tr>
           <td> 입고수량 </td>
           <td> <input type="text" name="su" onkeyup="numChk(this)"> </td>
         </tr>
         <tr>
           <td> 상품배송비 </td>
           <td> <input type="text" name="baeprice" onkeyup="numChk(this)"> </td>
         </tr>
         <tr>
           <td> 배송기간 </td>
           <td> <input type="text" name="baeday" onkeyup="numChk(this)"> </td>
         </tr>
         <tr>
           <td> 적립률 </td>
           <td> <input type="text" name="juk" onkeyup="numChk(this)"> </td>
         </tr>
         <tr>
           <td colspan="2" align="center"> <input type="submit" value="상품 등록"> </td>
         </tr>
       </table>
     </form>
   </section>
</body>
</html>