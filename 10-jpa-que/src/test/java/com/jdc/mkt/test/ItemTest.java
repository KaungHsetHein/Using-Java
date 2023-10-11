package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.mkt.entity.Item;
import com.jdc.mkt.test.utils.JupitorTest;

public class ItemTest extends JupitorTest{

	//@Test
	void test_select_by_catName_item() {
		var query = em.createQuery("Item.selectByCategoryName",Item.class);
	
		query.setParameter("cat", "Drinks");
		var list = query.getResultList();
		
		list.stream().map(Item::getName)
		.forEach(System.out::println);
	
	}
	
	@ParameterizedTest
	@CsvSource("6,1000")
	void test_update_by_catName(int id,int price) {
		
		//var em = emf.createEntityManager();
		em.getTransaction().begin();
		var query = em.createQuery("""
				Item.updateById
				""");
		query.setParameter("price", price);
		query.setParameter("id", id);
		
		var result = query.executeUpdate();
		//assertTrue(result>0);
		em.getTransaction().commit();
	}
	
	//@ParameterizedTest
	@CsvSource("6,1000")
	void test_deltete_by_catName(int id) {
		
		//var em = emf.createEntityManager();
		em.getTransaction().begin();
		var query = em.createQuery("""
				Item.deleteById
				""");
		//query.setParameter("price", price);
		query.setParameter("id", id);
		
		var result = query.executeUpdate();
		//assertTrue(result>0);
		em.getTransaction().commit();
	}
}
