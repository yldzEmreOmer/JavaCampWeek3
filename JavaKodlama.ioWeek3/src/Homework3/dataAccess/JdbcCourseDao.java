package Homework3.dataAccess;

import Homework3.entities.Course;

public class JdbcCourseDao implements CourseDao{

	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi: " + course.getCourseName());
	}
	
}
