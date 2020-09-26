package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * 
	 * @Test public void testAddCategory() {
	 * 
	 * category = new Category();
	 * 
	 * category.setName("Television");
	 * category.setDescription("this is some description for telivision.");
	 * category.setImageURL("cat_1.png");
	 * 
	 * assertEquals("Successfully added a category inside the table!" , true ,
	 * categoryDAO.add(category));
	 * 
	 * }
	 * 
	 */

	/*
	 * @Test public void testCategory() { category = categoryDAO.get(1);
	 * 
	 * assertEquals("Successfully fetch a single category from the table!" ,
	 * "Television" , category.getName());
	 * 
	 * }
	 * 
	 */

	/*
	 * @Test public void testUpdateCategory() { category = categoryDAO.get(1);
	 * 
	 * category.setName("TV");
	 * 
	 * assertEquals("Successfully update a single category in the table!" , true ,
	 * categoryDAO.update(category));
	 * 
	 * }
	 * 
	 */

	/*
	 * @Test public void testDeleteCategory() { category = categoryDAO.get(1);
	 * 
	 * category.setName("TV");
	 * 
	 * assertEquals("Successfully delete a single category in the table!" , true ,
	 * categoryDAO.detele(category));
	 * 
	 * }
	 * 
	 */

	/*
	 * @Test public void testListCategory() {
	 * 
	 * assertEquals("Successfully fetched the list of categories from the table!" ,
	 * 1 , categoryDAO.list().size());
	 * 
	 * }
	 * 
	 */

	@Test
	public void testCRUDCategory() {
		category = new Category();

		category.setName("Television");
		category.setDescription("this is some description for telivision.");
		category.setImageURL("cat_1.png");

		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));

		category = new Category();

		category.setName("Mobile");
		category.setDescription("this is some description for Mobile.");
		category.setImageURL("cat_2.png");

		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));

		
		//fetching and updating the category
		category = categoryDAO.get(1);
		
		category.setName("TV");

		assertEquals("Successfully update a single category in the table!", true, categoryDAO.update(category));

		
		//delete the category
		 assertEquals("Successfully delete a single category in the table!" , true ,categoryDAO.detele(category));
		 
		 //fetching the list
		 assertEquals("Successfully fetched the list of categories from the table!" , 1 , categoryDAO.list().size());
	}
}
 