package Homework3.entities;

public class Course {

	private int id;
	private String courseName;
	private int courseCode;
	private double price;

	public Course() {
		super();
	}

	public Course(int id, String courseName, int courseCode, double price) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

}
