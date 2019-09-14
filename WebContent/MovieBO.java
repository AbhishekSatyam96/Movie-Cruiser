import java.util.ArrayList;

import com.abhushek.Pojo.User;

import qwerty.MoviePOJO;

public class MovieBO {

	public static User findUser(String username,String password){
		
		User user=new User();
		
		user=MovieDAO.getUser(username,password);
		return user;
	}
	
	public static ArrayList<MoviePOJO> getMovieList(){
		
		ArrayList<MoviePOJO> Mp= new ArrayList<>();
		Mp=(ArrayList<MoviePOJO>) MovieDAO.getCustomerList();
		return Mp;
	}
	
	public static ArrayList<MoviePOJO> getMovieAdimList(){
		
		ArrayList<MoviePOJO> Mp= new ArrayList<>();
		Mp=(ArrayList<MoviePOJO>) MovieDAO.getAdminList();
		return Mp;
	}
	
	public static ArrayList<MoviePOJO> getFavouriteMovieList(int moviefavId){
		
		ArrayList<MoviePOJO> Mp = new ArrayList<>();
		Mp=(ArrayList<MoviePOJO>) MovieDAO.getFavouriteList(moviefavId);
		
		return Mp;
	}
	
}
