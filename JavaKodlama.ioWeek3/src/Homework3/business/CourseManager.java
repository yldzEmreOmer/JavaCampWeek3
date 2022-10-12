package Homework3.business;

import java.util.ArrayList;

import Homework3.dataAccess.CourseDao;
import Homework3.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	ArrayList<Course> courses = new ArrayList<>();

	public CourseManager(CourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	public void add(Course course) throws Exception {
		for (Course course1 : courses) {
			if (course.getCourseName().equals(course1.getCourseName())) {
				throw new Exception("Course name cant be repeat.");
			}
			if (course.getPrice() < 0) {
				throw new Exception("Course price cant be less than 0.");

			}
		}
		courseDao.add(course);
		courses.add(course);

	}
}
