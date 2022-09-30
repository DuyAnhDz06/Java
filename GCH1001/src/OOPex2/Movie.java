import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    // Object's properties
	private int id;
	private String title;
	private int year;
	private Director[] directors;

	private String[] genres;
	
        // Class's properties
        // Nếu bỏ biến static thì biến count sẽ làm tất cả mã ID trùng nhau (trường hợp này = 1)
	private static int COUNT = 1;
	
	public Movie(String title, int year, Director[] directors, String[] genres) {
		this.id = COUNT++;
		this.title = title;
		this.year = year;
		this.directors = directors;
		this.genres = genres;
//		this.directors = (ArrayList<Director>) Arrays.asList(directors);
//		this.genres = (ArrayList<String>) Arrays.asList(genres);
		for(Director dir: directors){
			dir.getMovies().add(this);
                 for(String each: genres){
                       if( dir.getGenres().add(each) == false);
                 dir.getGenres().add(each);
	}
        }
        }
	public String getTitle() {
		return title;
	}

	//////////////////////////////
	public Director[] getDirectors() {
		return directors;
	}
        public Director[] getGenres() {
		return genres;
	}
public void print()
{
    String dir = "";
    for(Director Diretor: directors)
    {
    dir += each.getName() + ",";
    }
    System.out.println("%-3d - %-20s - %-4d - Directed by: %30s - Genres: %30s \n",
            id title, year, dir,ger);
}
   
}

