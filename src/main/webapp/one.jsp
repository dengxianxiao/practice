<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>title</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css">
<style type="text/css">


	
</style>
<script type="text/javascript">
/*
	window.onload = function() {
		var oTab = document.getElementById("tab");
		var aH3 = oTab.getElementByTagName("h3");
		var aDiv = oTab.getElementByTagName("div");
		for (var i = 0; i < aH3.length; i++) {
			aH3[i].className = "";
			aDiv[i].style.display = "none";
		}
		this.className = "active";
		aDiv[this.index].style.display = "block";
	}
*/
</script>
</head>
<body>

<nav class="navbar navbar-default" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Home</a>
		</div>

		<ul class="nav navbar-nav navbar-right" role="navigation">
			<li role="presentation"><a href="#profile" role="tab"
				data-toggle="tab">About</a></li>
			<li role="presentation"><a href="#messages" role="tab"
				data-toggle="tab">Hobby</a></li>
			<li role="presentation"><a href="#settings" role="tab"
				data-toggle="tab">Contact</a></li>
		</ul>
	</div>
</nav>



<div class="contain-fluid">

		<div class="col-md-4">
			<div class="tab-content">
<!-- 				<div role="tabpanel" class="tab-pane" id="profile">profile</div> -->
				<div role="tabpanel" class="tab-pane" id="messages">messages</div>
				<div role="tabpanel" class="tab-pane" id="settings">settings</div>
			</div>
		</div>		
		<br>
	
		
		<div class="btn-group">
		<button type="button" class="btn btn-default">left</button>
		<button type="button" class="btn btn-default">middle</button>
		<button type="button" class="btn btn-default">right</button>
		</div>
	
	
	
	<form action="#" role="form" class="form-horizontal">
	<fieldset >
		<div class="form-group has-success has-feedback">
			<label for="exampleInputEmail" class="col-sm-2 control-label">Email</label>
			<div class="col-sm-2">
				<input type="email" class="form-control" id="exampleInputEmail" placeholder="Entre email">
				<span class=" glyphicon glyphicon-search form-control-feedback"></span>
				<span class="help-block">good idea you know</span>
			</div>
			
		</div>
		
		<div class="form-group has-warning has-feedback">
			<label for="exampleInputPassword" class="col-sm-2 control-label">Password</label>
			<div class="col-sm-2">
				<input type="password" class="form-control" id="exampleInputPassword" placeholder="Entre password">
				<span class="glyphicon glyphicon-warning-sign form-control-feedback"></span>
			</div>
		</div>
		
		<div class="form-group has-error has-feedback">
			<label for="exampleInputDate" class="col-sm-2 control-label">time</label>
			<div class="col-sm-2">
				<input type="date" id="exampleInputDate" class="form-control">
				<span class="glyphicon glyphicon-remove form-control-feedback"></span>
			</div>
		</div>
		
		
		
		<div class="form-group">
			<label for="exampleInputText" class="col-sm-2 control-label">Textarea</label>
			<div class="col-sm-2">
				<textarea rows="3" cols="" class="form-control" id="exampleInputText" ></textarea>
			</div>
		</div>
		
		<div class="form-group">
			<label for="exampleInputFile" class="col-sm-2 control-label">File input</label>
			<div class="col-sm-2">
				<input type="file" id="exampleInputFile">
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-2">
				<select class="form-control">
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
			</div>
			<div class="col-sm-2">
				<select multiple class="form-control">
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
			</div>
			<div class="col-sm-2">
				<button type="submit" class="btn btn-default btn-lg btn-block" disabled="disabled">Submit</button>
			</div>
			<div class="col-sm-2">
				<a href="#" class="btn btn-default btn-lg">Link</a>
			</div>
		</div>
		
		</fieldset>
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
</div>

		


	
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>
</body>
</html>