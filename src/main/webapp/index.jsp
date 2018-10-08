<%--@elvariable id="state" type="com.epam_lab.FirstServlet"--%>
<html>
<head>
    <title>Meow</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript" language="javascript" src="ajax.js"></script>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Simple Servlet Example</h1>
<div>Post = 1; Get = 2; Put = 3; Delete 4</div>
<div>
    <div id="post"><button  type="button" onclick="makeRequest2()">Post</button></div>
    <hr/>
    <div id="get"><button type="button" onclick="makeRequest1()">Get</button></div>
    <hr/>
    <div id="put"><button type="button" onclick="makeRequest3()">Put</button></div>
    <hr/>
    <div id="delete"><button type="button" onclick="makeRequest4()">Delete</button></div>
    <hr/>

</div>
</body>
</html>
