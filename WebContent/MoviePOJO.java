package qwerty;

public class MoviePOJO {
	private int mv_id;
	private String mv_title;
	private int mv_box_office;
	private String mv_active, genre, mv_teaser;
	private String mv_date_of_launch;
	
	
	
	
	public MoviePOJO(int mv_id, String mv_title, int mv_box_office, String mv_active,String mv_date_of_launch, String genre, String mv_teaser
			) {
		super();
		this.mv_id = mv_id;
		this.mv_title = mv_title;
		this.mv_box_office = mv_box_office;
		this.mv_active = mv_active;
		this.genre = genre;
		this.mv_teaser = mv_teaser;
		this.mv_date_of_launch = mv_date_of_launch;
		
	}




	public int getMv_id() {
		return mv_id;
	}




	public void setMv_id(int mv_id) {
		this.mv_id = mv_id;
	}




	public String getMv_title() {
		return mv_title;
	}




	public void setMv_title(String mv_title) {
		this.mv_title = mv_title;
	}




	public int getMv_box_office() {
		return mv_box_office;
	}




	public void setMv_box_office(int mv_box_office) {
		this.mv_box_office = mv_box_office;
	}




	public String getMv_active() {
		return mv_active;
	}




	public void setMv_active(String mv_active) {
		this.mv_active = mv_active;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}




	public String getMv_teaser() {
		return mv_teaser;
	}




	public void setMv_teaser(String mv_teaser) {
		this.mv_teaser = mv_teaser;
	}




	public String getMv_date_of_launch() {
		return mv_date_of_launch;
	}




	public void setMv_date_of_launch(String mv_date_of_launch) {
		this.mv_date_of_launch = mv_date_of_launch;
	}
	
	
}
