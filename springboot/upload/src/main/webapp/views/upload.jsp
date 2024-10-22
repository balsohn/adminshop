<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
    document.addEventListener('DOMContentLoaded', function() {
        const maxFileSize = 5 * 1024 * 1024; // 5MB로 제한

        document.getElementById('files').addEventListener('change', function(event) {
            const files = event.target.files;
            const fileList = document.getElementById('fileList');
            fileList.innerHTML = ''; // 기존 목록 초기화

            for (let i = 0; i < files.length; i++) {
                const file = files[i];
                const listItem = document.createElement('li');
                listItem.textContent = file.name + ' (' + (file.size / 1024 / 1024).toFixed(2) + ' MB)';

                if (file.size > maxFileSize) {
                    alert(file.name + '은(는) 5MB를 초과했습니다. 다른 파일을 선택해 주세요.');
                    event.target.value = ''; // 파일 선택 초기화
                    fileList.innerHTML = ''; // 파일 목록 초기화
                    break;
                } else {
                    fileList.appendChild(listItem);
                }
            }
        });
    });
</script>
</head>
<body>
	<form method="post" action="uploadOk" enctype="multipart/form-data">
		<input type="file" name="file">
		<input type="submit" value="업로드">
	</form>
	<hr>
	<form method="post" action="uploadOk2" enctype="multipart/form-data">
		<input type="file" name="files" id="files"multiple>
		<input type="submit" value="업로드">
	</form>
	
	<h3>선택된 파일들:</h3>
    <ul id="fileList"></ul>
</body>
</html>