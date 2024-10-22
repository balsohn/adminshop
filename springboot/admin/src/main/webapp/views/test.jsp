<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>파일 목록 확인</title>
</head>
<body>

    <td> 
        <input type="file" id="fileInput" name="pimg1" multiple> 
    </td>

    <script>
        document.getElementById('fileInput').addEventListener('change', function(event) {
            const files = event.target.files; // 파일 리스트 가져오기
            for (let i = 0; i < files.length; i++) {
                console.log('파일 이름:', files[i].name); // 파일 이름 출력
                console.log('파일 크기:', files[i].size); // 파일 크기 출력 (바이트 단위)
                console.log('파일 타입:', files[i].type); // 파일 타입 출력 (예: image/png)
            }
        });
    </script>

</body>
</html>
