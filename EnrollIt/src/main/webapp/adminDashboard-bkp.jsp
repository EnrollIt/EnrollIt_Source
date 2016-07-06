<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta content="IE=edge" http-equiv="X-UA-Compatible">
<meta content="width=device-width, initial-scale=1" name="viewport">
<!-- InstanceBeginEditable name="TITLE" -->


<title>Enrollit</title>
<link href="images/logoIcon.png" rel="icon" type="image/png">
<!-- InstanceEndEditable -->
<!-- Bootstrap -->
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/font-awesome.css" rel="stylesheet">
<!-- eoverriding the current bootstrap classes and ceating other reqired classes -->
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div width="100%">
		<input type="button" value="Add School" data-target=".loginModal"
			data-toggle="modal">
	</div>
	<form method="get">
		<table width="100%">
			<tr>
				<th>S.no.</th>
				<th>Name</th>
				<th>Location</th>
				<th>Action</th>
			</tr>
			<tr align="center">
				<td>1</td>
				<td>DPS</td>
				<td>delhi</td>
				<td><input type="submit" formaction="/edit/a" value="edit" />
					<input type="submit" formaction="/delete/a" value="delete" /></td>
			</tr>
		</table>
	</form>

	<div aria-labelledby="mySmallModalLabel" class="modal fade loginModal"
		role="dialog" tabindex="-1">
		<form method="post">
			<div class="modal-dialog modal-sm enroolitLoginUp">
				<button class="close" data-dismiss="modal" type="button">
					<span aria-hidden="true" class="fa fa-close"></span><span
						class="sr-only">Close</span>
				</button>

				<div class="modal-content popUpLogin">
					<div class="row enrollitPopUpImg">
						<img alt="..." class="img-responsive" src="images/logoPopUp.png">
					</div>


					<div class="row">
						<div class="form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<input class="form-control" name="schoolName"
									placeholder="School Name" type="text">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<input class="form-control" name="pincode" placeholder="Pin Code"
									type="number" max=999999 min=100000>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<input class="form-control" name="state" placeholder="State"
									type="text">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<input class="form-control" name="fees" placeholder="Fees"
									type="number">
							</div>
						</div>
					</div>
					<div class="clearfix" display="inline">
						<div class="form-group col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<label for="facility">faclity 1</label> <input id="facility"
									placeholder="Fees" type="checkbox" name="facilities"
									value="3"> <label for="facility">faclity
									2</label> <input id="fees" placeholder="Fees" type="checkbox"
									name="facilities" value="5"> <label
									for="facility">faclity 3</label> <input id="fees"
									placeholder="Fees" type="checkbox" name="facilities"
									value="6"> <label for="facility">faclity
									4</label> <input id="fees" placeholder="Fees" type="checkbox"
									name="facilities" value="4">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 SignUpPanel">
							<button
								class=" form-control btn btnSignUp col-lg-6 col-md-6 col-sm-6 col-xs-12"
								type="submit" formaction="admin/addSchool">Add</button>
						</div>
					</div>

				</div>
			</div>
		</form>
	</div>



	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.1.min.js">
    </script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js">
    </script>
	<!-- InstanceBeginEditable name="Page Related Script" -->

</body>
</html>