import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Director one = new Director(101, "Nguyen Duy Em");
		Director two = new Director(202, "Thomas Yoon");
		Director three = new Director(303, "Peter Pan");
		Director four = new Director(404, "David James");
		Director five = new Director(505, "Do Nam Trung");
		
		ArrayList<Movie> aList = new ArrayList<>();
		aList.add(new Movie("Cuon theo chieu gio", 1990
				, new Director[]{one, four}
				, new String[] {Genre.ACTION, Genre.COMEDY})); 
		aList.add(new Movie("Harry Potter", 2006
				, new Director[]{two}
				, new String[] {Genre.DRAMA})); 
		aList.add(new Movie("Tro ve Eden", 1990
				, new Director[]{four, five }
				, new String[] {Genre.SCIENCE, Genre.COMEDY})); 
		aList.add(new Movie("Nhung nguoi khon kho", 1990
				, new Director[]{one, four}
				, new String[] {Genre.SCIENCE})); 
		aList.add(new Movie("Bong ma nha hat", 2001
				, new Director[]{one, four}
				, new String[] {Genre.ACTION})); 
		aList.add(new Movie("Bo gia", 1990
				, new Director[]{one, four}
				, new String[] {Genre.ACTION, Genre.COMEDY})); 
		aList.add(new Movie("Bay cuu im lang", 2000
				, new Director[]{three}
				, new String[] {Genre.DRAMA, Genre.COMEDY})); 
		aList.add(new Movie("Dao hoang", 1990
				, new Director[]{four}
				, new String[] {Genre.DRAMA})); 
		
		System.out.println("Count = " + aList.size());
		/////////////////////////////////////////////////////
		// ---------------------- (a) ----------------------
		// Find the number of movies of each director
		Director[] listDirector = new Director[] {one, two, three, four, five};
		for(Director each: listDirector) {
//			int count = 0;
//			for(Movie eachMoive: aList) {
//				if(isExist(each, eachMoive.getDirectors()))
//					count++;
//			}
			System.out.println(each.getName() + 
					" directs " + each.getMovies().size() + " movie(s)");
			for(Movie eachMovie: each.getMovies()) {
				System.out.println("\t -- " + eachMovie.getTitle());
			}
		}
                System.out.println("//////////////////////////////////////////////////////");
		// ---------------------- (b) ----------------------
		// Find the number of genres of each director's movies.
                for(Director each: listDirector)
{
    System.out.println(each.getName() + 
" directs " + each.getGenres().size() + " genre(s)");
    for(String eachGenre: each.getGenres()) {
				System.out.println("\t -- " + eachGenre);
			}
    System.out.println("//////////////////////////////////////////////////////");
		// ---------------------- (c) ----------------------
		// Find the list of movies having the genres "Drama" and "Comedy" only.
                for(Movie each: aList)
                {
                    contain(each.getGenres(), "Drama", "Comedy")==true)
                    {
                        each.print();
                    }
                }
}
                private static boolean contains(String[] genres, String a, String b) {
            int count = 0 ;
            boolean x = false;
            boolean y = false;
            for (String each: genres){
                if(each.equalsIgnoreCase(a)) 
                    x = true;
                if(each.equalsIgnoreCase(b)) y = true;
                
            }
               if(x && y )
                   return true;
               else return false;
                }
				
	}

	private static boolean isExist(Director each, Director[] directors) {
            
		for(Director dir: directors)
			if(each==dir)
				return true;
		return false;
	}

    private static boolean contain(Director[] genres, String drama, String comedy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
