package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import net.kzn.shoppingbackend.dao.ProductDAO;
import net.kzn.shoppingbackend.dto.Product;

public class ProductTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}
	
	/*
	@Test
	public void testCRUDProduct()
	{
		//create operation
		product  = new Product();
		
		product.setName("Oppo Selfie S53");
		product.setBrand("Oppo");
		product.setDescription("This is some Description for oppo mobile phones!");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		
		assertEquals("Sometime went wrong while inserting a new Product!", true,productDAO.add(product));
	

	//reading and updating the category
	product = productDAO.get(2);
	product.setName("Samsung Galaxy S7");
	assertEquals("Sometime went wrong while updating the exiting record",true,productDAO.update(product));
	
	assertEquals("Sometime went wrong while updating the exiting record",true,productDAO.delete(product));
	
	//list
	assertEquals("Sometime went wrong while fetching the list of product",6,productDAO.list().size());
	}
	*/
	
	@Test
	public void testListActiveProducts()
	{
		//list
		assertEquals("Sometime went wrong while fetching the list of product",5,productDAO.listActiveProducts().size());	
	}
	
	@Test
	public void testListActiveProductsByCategory()
	{
		//list
		assertEquals("Sometime went wrong while fetching the list of product",3,productDAO.listActiveProductsByCategory(3).size());	
		assertEquals("Sometime went wrong while fetching the list of product",2,productDAO.listActiveProductsByCategory(1).size());	

	}
	
	@Test
	public void testGetLatestActiveProducts()
	{
		assertEquals("Sometime went wrong while fetching the list of product",3,productDAO.getLatestActiveProducts(1).size());	
	}
	
}
