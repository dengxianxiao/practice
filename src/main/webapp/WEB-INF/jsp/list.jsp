<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<h2>Hello World!</h2>

<h1>${message }</h1>

<h2>${list }</h2>
<form action="list" method="get">
	<input type="submit" value="put">
</form>

<h2>${detail.name }</h2>
<form action="1000/detail" method="get">
	<input type="text" value="1000">
	<input type="submit" value="put">
</form>

<h2>${appoint }</h2>
<form action="appoint" method="post">
	<input type="submit" value="put">
</form>
</body>
</html>
