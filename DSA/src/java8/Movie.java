package java8;

public class Movie implements Comparable{
	private String name;
	private int year;
	private double rating;
	public Movie(String name, int year, double rating) {
		super();
		this.name = name;
		this.year = year;
		this.rating = rating;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Movie m = (Movie) o;
		return this.year - m.year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", year=" + year + ", rating=" + rating + "]";
	}
	

}
