package Homework3.dataAccess;

import Homework3.entities.Instructor;

public class HibernateInstuctorDao implements InstructorDao{

public void add(Instructor instructor) {
		
	System.out.println("Hibernate ile veritabanına eklendi: " + instructor.getFirstName());
	}
}
