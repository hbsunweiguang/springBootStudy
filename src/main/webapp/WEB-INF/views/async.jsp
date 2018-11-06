<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <script src="https://cdn.bootcss.com/jquery/1.12.0/jquery.js"></script>
    <script type="text/javascript">

        deferred();

        function deferred(){
            $.get('defer',function(data){
                console.log(data);
                deferred();
            });
        }
    </script>
</body>
</html>
