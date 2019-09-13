<%@page import="java.sql.*"%>
<%@page import="qwerty.*"%>
<%@page import="java.util.*"%>



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


	<section>
		<h1>Movies</h1>


		<table>
			<tr>
				<th>Title</th>
				<th>Box Office</th>
				<th>Active</th>
				<th>Date of Launch</th>
				<th>Genre</th>
				<th>Has Teaser</th>
				<th>Action</th>
			</tr>

			<%
				ArrayList<MoviePOJO> admlist = (ArrayList<MoviePOJO>) session.getAttribute("admlist");

				for (MoviePOJO obj : admlist) {
			%>


			<tr>
				<td><%=obj.getMv_title()%></td>
				<td>$<%=obj.getMv_box_office()%></td>
				<td><%=obj.getMv_active()%></td>
				<td><%=obj.getMv_date_of_launch()%></td>
				<td><%=obj.getGenre()%></td>
				<td><%=obj.getMv_teaser()%></td>
				<td><a href="movie-edit.jsp?mid=<%out.print(obj.getMv_id());%>">Edit</a></td>


			</tr>

			<%
				}
			%>


		</table>

		<form action="Main_Servlet" method="get" class="lgout">
			
				<input type="hidden" name="RequestId" value="5"> 
				
				<input type="submit" value="Logout">
	
		</form>

	</section>



	<footer> Copyright &copy 2019 </footer>
</body>

</html>


