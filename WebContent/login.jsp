<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="style-movie-list-admin.css">
    <link rel="stylesheet" type="text/css" href="style-login.css">
</head>
<body>
	
	 <div class="row">
        <div class="column">
            <h1>
                Movie Cruiser
                <img src="images/movie-cruiser-icon.jpg" height="30px" width="30px" alt="LOGO">
            </h1>
        </div>
        <div class="column">
            <span class="rgt">
                <a href="#">Movies</a>
            </span>
        </div>
    </div>

    <section>
        <div class="loginbox">
            <img src="images/icon.png" class="avtar">
            <h1 class="h11">Login Here</h1>
            <form action="Main_Servlet" method="get">
            	<input type="hidden" value="1" name="RequestId">
                <p>User Name</p>
                <input type="text" name="user_name" placeholder="Enter User Name" required>
                <p>Password</p>
                <input type="password" name="user_password" placeholder="Enter password" required>
                <input type="submit" value="Login">
            </form>
        </div>
        
        
        
    </section>

    <footer>
        Copyright &copy 2019
    </footer>

</body>
</html>