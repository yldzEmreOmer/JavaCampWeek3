package Homework3.dataAccess;

import Homework3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	public void add(Category category) {
		
		System.out.println("Jdbc ile veritabanına eklendi: " + category.getCategoryName());
	}
}
