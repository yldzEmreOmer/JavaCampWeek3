package Homework3.business;

import java.util.ArrayList;

import Homework3.dataAccess.CategoryDao;
import Homework3.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	ArrayList<Category> categories = new ArrayList<>();

	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	public void add(Category category) throws Exception {

		for (Category category1 : categories) {
			if(category.getCategoryName().equals(category1.getCategoryName())) {
				throw new Exception("Category name cant be repeat.");
			}
		}
		categoryDao.add(category);
		categories.add(category);
		
	}
}
