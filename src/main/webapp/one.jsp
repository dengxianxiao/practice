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
		<tr class="masthead">
			<td>7</td>
			<td>8</td>
			<td>9</td>
		</tr>
	</table>

		<div class="col-md-2">
			<!-- Nav tabs -->
			<ul class="nav nav-pills nav-stacked" role="tablist">
				<li role="presentation" class="active"><a href="#home"
					role="tab" data-toggle="tab">Home</a></li>
				<li role="presentation"><a href="#profile" role="tab"
					data-toggle="tab">Profile</a></li>
				<li role="presentation"><a href="#messages" role="tab"
					data-toggle="tab">Messages</a></li>
				<li role="presentation"><a href="#settings" role="tab"
					data-toggle="tab">Settings</a></li>
			</ul>
	
			<!-- Tab panes -->
			<div class="tab-content">
				<div role="tabpanel" class="tab-pane active" id="home">home</div>
				<div role="tabpanel" class="tab-pane" id="profile">profile</div>
				<div role="tabpanel" class="tab-pane" id="messages">messages</div>
				<div role="tabpanel" class="tab-pane" id="settings">settings</div>
			</div>
		</div>		
		<br>
	
	
	
	
		
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

		


	
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>
</body>
</html>