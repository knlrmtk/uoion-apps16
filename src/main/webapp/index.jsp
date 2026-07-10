<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>

<html>

<head>

<title>UOION Login</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<div class="container">

<h1>UOION Demo Application</h1>

<h3>Tomcat 9 + Java 21</h3>

<form action="login" method="post">

<input type="text"
       name="username"
       placeholder="Username"
       required>

<input type="password"
       name="password"
       placeholder="Password"
       required>

<button type="submit">
Login
</button>

</form>

<p style="color:red">
${error}
</p>

<p>

Demo Login

<br><br>

Username :
<b>admin</b>

<br>

Password :
<b>admin123</b>

</p>

</div>

</body>

</html>
