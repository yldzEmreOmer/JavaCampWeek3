package Homework3;

import Homework3.business.CategoryManager;
import Homework3.business.CourseManager;
import Homework3.business.InstructorManager;
import Homework3.core.DatabaseLogger;
import Homework3.core.EmailLogger;
import Homework3.core.FileLogger;
import Homework3.core.Logger;
import Homework3.dataAccess.CategoryDao;
import Homework3.dataAccess.CourseDao;
import Homework3.dataAccess.HibernateCourseDao;
import Homework3.dataAccess.InstructorDao;
import Homework3.dataAccess.JdbcCategoryDao;
import Homework3.dataAccess.JdbcInstructorDao;
import Homework3.entities.Category;
import Homework3.entities.Course;
import Homework3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		//Loggers: 
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
		
		// COURSE:
		Course course1 = new Course(1, "Java", 5, 15);
		Course course2 = new Course(2, "Python", 2, 1);
		CourseDao courseDao = new HibernateCourseDao();
		CourseManager courseManager = new CourseManager(courseDao);
		courseManager.add(course1);
		courseManager.add(course2);

		// INSTRUCTOR:
		Instructor instructor1 = new Instructor(1, "Emre", "Yıldız");
		InstructorDao instructorDao = new JdbcInstructorDao();
		InstructorManager instructorManager = new InstructorManager(instructorDao, loggers);
		instructorManager.add(instructor1);

		// CATEGORY:
		Category category1 = new Category(1, "Courses");
		Category category2 = new Category(2, "My Courses");
		CategoryDao categoryDao = new JdbcCategoryDao();
		CategoryManager categoryManager = new CategoryManager(categoryDao);
		categoryManager.add(category1);
		categoryManager.add(category2);
	}

}
