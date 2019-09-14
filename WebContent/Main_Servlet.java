
import com.abhushek.Pojo.User;
import com.mysql.jdbc.Connection;

import qwerty.MoviePOJO;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Main_Servlet")
public class Main_Servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int Request_Id = (Integer.parseInt(request.getParameter("RequestId")));
		
		switch (Request_Id) {

		case 1:
			String userid = request.getParameter("user_name");
			String userpass = request.getParameter("user_password");

			User user = new User();
			user = MovieBO.findUser(userid, userpass);
			
			if (user.getUsercat().equals("Admin")) {
				ArrayList<MoviePOJO> admlist = new ArrayList<>();
				admlist = (ArrayList<MoviePOJO>) MovieDAO.getCustomerList();
				HttpSession session = request.getSession();
				session.setAttribute("admlist", admlist);

				RequestDispatcher rd = request.getRequestDispatcher("movie-list-admin.jsp");
				rd.forward(request, response);
			} else {
				ArrayList<MoviePOJO> cstlist = new ArrayList<>();
				cstlist = (ArrayList<MoviePOJO>) MovieDAO.getCustomerList();
				HttpSession session = request.getSession();
				session.setAttribute("cstlist", cstlist);
				RequestDispatcher rd = request.getRequestDispatcher("movie-list-customer.jsp");
				rd.forward(request, response);
			}
			break;

		case 2:
		

			int moviefavId = Integer.parseInt(request.getParameter("movieid"));
			
/*
			ArrayList<MoviePOJO> fav = new ArrayList<>();
			fav = MovieBO.getFavouriteMovieList(moviefavId);*/
			

			// Adding movie to databse

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_cruiser",
						"root", "password-1");
				Statement stmt = con.createStatement();

				ResultSet rs = stmt.executeQuery("select * from  Movie_name");

				while (rs.next()) {
					int movieId = rs.getInt(1);

					if (movieId == moviefavId) {

						String sql = "insert into Favourites (fv_us_id,fv_mv_id) values (2," + movieId + ")";
						stmt.executeUpdate(sql);

						break;
					}

				}

			} catch (Exception e) {
				System.out.println(e);
			}

			ArrayList<MoviePOJO> favlist = new ArrayList<>();
			favlist = (ArrayList<MoviePOJO>) MovieDAO.getFavouriteList(moviefavId);
			HttpSession session = request.getSession();
			session.setAttribute("favlist", favlist);
			RequestDispatcher rd = request.getRequestDispatcher("favourites.jsp");
			rd.forward(request, response);

			break;
			
			
			
		case 3:
			
			
			int delId = Integer.parseInt(request.getParameter("movieid"));
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_cruiser",
						"root", "password-1");
				Statement stmt = con.createStatement();

				ResultSet rs = stmt.executeQuery("select * from  Movie_name");

				while (rs.next()) {
					int movieId = rs.getInt(1);

					if (movieId == delId) {

						String sql = "delete from favourites where fv_mv_id ="+delId+"";
						stmt.executeUpdate(sql);
						
						
						ArrayList<MoviePOJO> dellist = new ArrayList<>();
						dellist = (ArrayList<MoviePOJO>) MovieDAO.getFavouriteList(3);
						HttpSession session1 = request.getSession();
						session1.setAttribute("favlist", dellist);
						RequestDispatcher rdd = request.getRequestDispatcher("favourites.jsp");
						rdd.forward(request, response);
						
						
						
						break;
					}

				}

			} catch (Exception e) {
				System.out.println(e);
			}
			
			
			break;
			
			
			
			
			
		case 4:
			
	
			int movieId=Integer.parseInt((request.getParameter("mid")));
			String movieTitle=request.getParameter("mtitle");
			int movieGross=Integer.parseInt((request.getParameter("mgross")));
			String movieActive=request.getParameter("mActive");
			String movieDOL=request.getParameter("mdate");
			String movieGenre=request.getParameter("mgenre");
			String movieTeaser=request.getParameter("mteaser");
			if(movieTeaser==null){
				movieTeaser="No";
			}
			
			
			
			
			
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_cruiser",
						"root", "password-1");
				Statement stmt = con.createStatement();

				String sql2="update Movie_name set mv_title='"+movieTitle+"', mv_box_office= "+ movieGross +", mv_active='"+ movieActive +"', mv_date_of_launch='"+movieDOL+
						"',mv_genre='"+movieGenre+"',mv_teaser='"+movieTeaser+"' where mv_id="+movieId+";";
				System.out.println(sql2);
				int sd = stmt.executeUpdate(sql2);	
				
				if(sd>0){
				RequestDispatcher rdd = request.getRequestDispatcher("movie-list-admin-notification.jsp");
				rdd.forward(request, response);
				}

			} catch (Exception e) {
				System.out.println(e);
			}
			
			
			break;
			
			
			
		case 5:
			
			HttpSession session2 = request.getSession();
			session2.invalidate();
			RequestDispatcher rdd = request.getRequestDispatcher("login.jsp");
			rdd.forward(request, response);
			
		}
	}

}
