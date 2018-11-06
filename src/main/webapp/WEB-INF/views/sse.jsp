<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Title</title>
</head>
<body>

    <div id="msgFromPush"></div>
    <script src="https://cdn.bootcss.com/jquery/1.12.0/jquery.js"></script>
    <script type="text/javascript">
        if (!!window.EventSource) {
            var source = new EventSource('push');
            s = '';
            source.addEventListener('message',function(e){
                s+=e.data+"<br/>";
                $("#msgFromPush").html(s);
            });

            source.addEventListener('open',function (e) {
                console.log("连接打开.");
            },false);

            source.addEventListener('error',function (e) {
                console.log(e);
                console.log(EventSource.CLOSED);
                if (e.currentTarget.readyState == EventSource.CLOSED) {
                    console.log("连接关闭");
                } else {
                    console.log(e.currentTarget.readyState);
                }
            },false);
        } else {
            console.log("你的浏览器不支持SSE");
        }
    </script>
</body>
</html>
