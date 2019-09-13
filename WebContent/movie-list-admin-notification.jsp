<!DOCTYPE html>
<html lang="en-us">

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Admin Movie List</title>
<link rel="stylesheet" type="text/css" href="style-movie-list-admin.css">
</head>

<body>
	<div class="row">
		<div class="column">
			<h1>
				Movie Cruiser <img src="images/movie-cruiser-icon.jpg" height="30px"
					width="30px" alt="LOGO">
			</h1>
		</div>
		<div class="column">
			<span class="rgt"> <a href="#">Movies</a>
			</span>
		</div>
	</div>
</body>

<h1 style="text-align:center"> Edit Successfully	<br> <br> <br>
	
	
	<a href="Main_Servlet?RequestId=1&user_name=Abhishek&user_password=Satyam">Go to Movie List</a>
	
	</h1>
    	<form action="Main_Servlet" method="get">
        <input type="hidden" name="RequestId" value="5">
        <input type="submit" value="Logout" >
        </form>


<footer> Copyright &copy 2019 </footer>
</html>