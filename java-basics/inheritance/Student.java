package inheritance;


//extends means "IS A" relation ship
//eg. student is a person
public class Student extends Person {

	private String collegeName;
	private int year;
	
	//constructors
	public Student(String name) {
		super(name);
		System.out.println("Student constructor");
		
	}
	
	
	//getters and setters
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
