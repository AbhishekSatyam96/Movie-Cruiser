import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import qwerty.*;

import com.abhushek.Pojo.User;
import com.mysql.jdbc.Connection;

public class MovieDAO {
	
	
	
	public static User getUser(String username,String password){
		System.out.println(username+" "+password);
		User user=new User();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_cruiser","root", "password-1");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from credential where user_name='"+username+"' and user_pass='"+password+"'");			
			while (rs.next()) {
				int userId=rs.getInt(1);
				String userName=rs.getString(2);				
				String userpass=rs.getString(3);
				String usercat=rs.getString(4);				
				System.out.println(user.getUsercat());
				user=new User(userId,userName,userpass,usercat);
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return user;
	}

	
	

	public static List<MoviePOJO> getCustomerList(){
			
			ArrayList<MoviePOJO> cstlist=new ArrayList<>();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_cruiser","root", "password-1");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from movie_name");
				
				while (rs.next()) {
					int movieId=rs.getInt(1);
					String movieTitle=rs.getString(2);
					int movieGross=rs.getInt(3);
					String movieActive=rs.getString(4);
					String movieDOL=rs.getString(5);
					String movieGenre=rs.getString(6);
					String movieTeaser=rs.getString(7);
					
					MoviePOJO m=new MoviePOJO(movieId,movieTitle,movieGross,movieActive,movieDOL,movieGenre,movieTeaser);
					
					cstlist.add(m);
					
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}

			
			return cstlist;
		}

	public static List<MoviePOJO> getAdminList(){
			ArrayList<MoviePOJO> admlist=new ArrayList<>();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_cruiser","root", "password-1");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from movie_name");
				
				while (rs.next()) {
					int movieId=rs.getInt(1);
					String movieTitle=rs.getString(2);
					int movieGross=rs.getInt(3);
					String movieActive=rs.getString(4);
					String movieDOL=rs.getString(5);
					String movieGenre=rs.getString(6);
					String movieTeaser=rs.getString(7);
					
					MoviePOJO m=new MoviePOJO(movieId,movieTitle,movieGross,movieActive,movieDOL,movieGenre,movieTeaser);
					
					admlist.add(m);
					
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}

			
			return admlist;
	}

	public static List<MoviePOJO> getFavouriteList(int moviefavId){
				ArrayList<MoviePOJO> favlist=new ArrayList<>();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_cruiser","root", "password-1");
				Statement stmt = con.createStatement();
				
			//	String sql1="select * from movie_Name where mv_id in ( select fv_mv_id from Favourites where fv_mv_id="+moviefavId+")";
				String sql1="select * from movie_Name where mv_id in ( select fv_mv_id from Favourites)";
						
				ResultSet rs = stmt.executeQuery(sql1);
				
				while (rs.next()) {
					int movieId=rs.getInt(1);
					String movieTitle=rs.getString(2);
					int movieGross=rs.getInt(3);
					String movieActive=rs.getString(4);
					String movieDOL=rs.getString(5);
					String movieGenre=rs.getString(6);
					String movieTeaser=rs.getString(7);
					
					MoviePOJO m=new MoviePOJO(movieId,movieTitle,movieGross,movieActive,movieDOL,movieGenre,movieTeaser);
					
					favlist.add(m);
					
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}

			
			return favlist;
		}
	}
		
		
