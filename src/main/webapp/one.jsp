<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>title</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css">
<style type="text/css">
	.wrapper {
  .make-row();
}
.content-main {
  .make-lg-column(8);
}
.content-secondary {
  .make-lg-column(3);
  .make-lg-column-offset(1);
}
	
</style>
</head>
<body>
<div class="contain-fluid">
	
	<table class="table table-responsive table-striped table-bordered table-hover">
		<tr>
			<td class="active">1</td>
			<td class="success">2</td>
			<td class="info">3</td>
		</tr>
		<tr>
			<td class="warning">4</td>
			<td class="danger">5</td>
			<td class="active">6</td>
		</tr>
		<tr class="info">
			<td>7</td>
			<td>8</td>
			<td>9</td>
		</tr>
	</table>
		
	<form action="#" role="form">
		<div class="form-group">
			<label for="exampleInputEmail">Email address</label>
			<input type="email" class="form-control" id="exampleInputEmail" placeholder="Entre email">
		</div>
		
		<div class="form-group">
			<label for="exampleInputPassword">Password</label>
			<input type="password" class="form-control" id="exampleInputPassword" placeholder="Entre password">
		</div>
		
		<div class="form-group">
			<label for="exampleInputFile">File input</label>
			<input type="file" id="exampleInputFile">
		</div>
		
		<div class="form-group">
			<label>
				<input type="checkbox"> Check me out
			</label>
		</div>
		
		<button type="submit" class="btn btn-default">Submit</button>
	</form>	
	
	<form action="#" role="form" class="form-inline">
		<div class="form-group">
			<label for="exampleInputEmail1" class="sr-only">Email address</label>
			<input type="email" class="form-control" id="exampleInputEmail1" placeholder="Entre email">
		</div>
		
		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">@</div>
				<input class="form-control" type="email" placeholder="Enter email">
			</div>
		</div>
			<div class="form-group">
				<label class="sr-only" for="exampleInputPassword2">Password</label>
				<input type="password" class="form-control"
					id="exampleInputPassword2" placeholder="Password">
			</div>
			<div class="checkbox">
				<label> <input type="checkbox"> Remember me
				</label>
			</div>
			<button type="submit" class="btn btn-default">Sign in</button>
		</form>
		
</div>

		


	
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>
</body>
</html>