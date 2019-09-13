<!DOCTYPE html>
<html lang="en-us">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Edit Movies</title>
    <link rel="stylesheet" type="text/css" href="style-movie-list-admin.css">
    <link rel="stylesheet" type="text/css" href="style-edit-movie.css">
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
                <a href="movie-list-admin.jsp">Movies</a>
            </span>
        </div>
    </div>

    <section>
        <h1>Edit Movies</h1>
        <form action="Main_Servlet">
        	<input type="hidden" value="<%=request.getParameter("mid") %>" name="mid" >
			<input type="hidden" value="4" name="RequestId">
			<div class="form-div tit">
                <label for="title"><b>Title</b></label> <br>
                <input type="text" id="title" size="70" name="mtitle" required>
            </div>

            <div class="form-div">
                <label for="gross"><b>Gross ($)</b></label> <br>
                <input type="number" id="gross" required name="mgross">
            </div>

            <div class="form-div">

                <label for="active"><b>Active</b></label> <br>
                <input type="radio" id="active" name="mActive">Yes
                <input type="radio" id="active" name="mActive">No
            </div>

            <div class="form-div">

                <label for="date"><b>Date of Launch</b></label> <br>
                <input type="date" id="date" name="mdate" required>
            </div>

            <div class="form-div">
                <label for="genre"><b>Genre</b></label> <br>

                <select name="mgenre">
                <option value="superhero">Superhero</option>
                <option value="science-fiction">Science Fiction</option>
                <option value="romance">Romance</option>
                <option value="comedy">Comedy</option>
                <option value="adventure">Adventure</option>
                <option value="thriller">Thriller</option>
                </select>
                
            </div>
             <input type="checkbox" name="mcheck"> <b>Has Teaser</b>
            <br><br><br>
            <input type="submit" value="Save">
            
        </form>
       
            
        <br><br><br><br>
        
         <!--<button onclick="window.location.movie-list-admin.html"> Save </button>-->
          <form action="Main_Servlet" method="get">
        <input type="hidden" name="RequestId" value="5">
        <input type="submit" value="Logout" >
        </form>
         
         

    </section>

    <br><br><br><br><br>
    <footer>
        Copyright &copy 2019
    </footer>

</body>

</html>