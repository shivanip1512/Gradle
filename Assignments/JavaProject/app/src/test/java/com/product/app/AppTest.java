/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.product.app;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AppTest {
	@Test
	public void test_Product() {
		Product p = new Product().setName("A").setDescription("desc").setPrice(1000d);
		assertNotNull(p.getPrice());
		assertNotNull(p.getDescription());
		assertNotNull(p.getName());
	}
}
