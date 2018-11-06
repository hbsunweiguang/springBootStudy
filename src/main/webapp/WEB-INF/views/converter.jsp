<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div id="resp"></div>
    <input type="button" onclick="req();" value="请求"/>
    <script src="https://cdn.bootcss.com/jquery/1.12.0/jquery.js"></script>
    <script>
        function req() {
            $.ajax({
                url:"convert",
                data: "1-sunweiguang",
                type:"POST",
                contentType: "application/x-wisely",
                success : function (data) {
                    $("#resp").html(data);
                }
            })
        }
    </script>
</body>
</html>
