package Homework3.dataAccess;

import Homework3.entities.Course;

public class HibernateCourseDao implements CourseDao {

	public void add(Course course) {

		System.out.println("Hibernate ile veritabanına eklendi: " + course.getCourseName());
	}
}
