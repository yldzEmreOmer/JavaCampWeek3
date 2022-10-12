package Homework3.dataAccess;

import Homework3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	public void add(Instructor instructor) {
		
		System.out.println("Jdbc ile veritabanına eklendi: " + instructor.getFirstName());
	}
}
