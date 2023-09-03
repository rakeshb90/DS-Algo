package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVsComparator {
	
	class RatingComparator implements Comparator<Movie>{

		@Override
		public int compare(Movie m1, Movie m2) {
			// TODO Auto-generated method stub
			if(m1.getRating() < m2.getRating())
			    return -1;
			else if(m1.getRating() > m2.getRating())
				return 1;
			else
				return 0;
		}
		
	}
	class NameComparator implements Comparator<Movie>{

		@Override
		public int compare(Movie m1, Movie m2) {
			// TODO Auto-generated method stub
			return m1.getName().compareTo(m2.getName());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("OMG",2020,4));
		movies.add(new Movie("Dil",2016,4.5));
		movies.add(new Movie("2.0",2022,4));
		movies.add(new Movie("Shole",1998,4.5));
		movies.add(new Movie("Mela",2000,3.5));
		// sort with natural order(Year)
		Collections.sort(movies);
		for(Movie m:movies)
			System.out.println(m);
		System.out.println("********************sort with custom order(rating)****************");
		// sort with custom order(rating)
		ComparableVsComparator obj = new ComparableVsComparator();
		Collections.sort(movies,obj.new RatingComparator());
		for(Movie m:movies)
			System.out.println(m);
		System.out.println("********************sort with custom order(name)****************");
		// sort with custom order(name)
		Collections.sort(movies,obj.new NameComparator());
		for(Movie m:movies)
			System.out.println(m);
		

	}

}
