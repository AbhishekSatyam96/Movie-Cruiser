<%@page import ="java.util.*" %>
<%@page import = "qwerty.*" %>

<!DOCTYPE html>
<html lang="en-us">


<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User Movie List</title>
    <link rel="stylesheet" type="text/css" href="style-movie-list-customer.css">
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
        <div class="column">
            <span class="rgt">
                <a href="#">Favourites</a>
               
            </span>
        </div>
    </div>


    <section>
        <h1>Movies</h1>

        <table>
            <tr>
                <th>Title</th>
                <th>Box Office</th>
                <th>Genre</th>
                <th>Has Teaser</th>
                <th>Action</th>
            </tr>
            
            <%
            ArrayList<MoviePOJO> cstlist=(ArrayList<MoviePOJO>)session.getAttribute("cstlist");
            
            for(MoviePOJO obj:cstlist) { 
            %>
            <tr>
                <td><% out.print(obj.getMv_title());%></td>
                <td>$<%out.print(obj.getMv_box_office());%></td>
                <td><%= obj.getGenre() %></td>
                <td><%= obj.getMv_teaser()%></td>
                <td><a href="Main_Servlet?RequestId=2&movieid=<%= obj.getMv_id()%>">Add to favorite</a></td>
              
            </tr>
            <%} %>		
        </table>
        <form action="Main_Servlet" method="get">
        <input type="hidden" name="RequestId" value="5">
        <input type="submit" value="Logout" >
        </form>
    </section>



    <footer>
        Copyright &copy 2019
    </footer>
</body>

</html>