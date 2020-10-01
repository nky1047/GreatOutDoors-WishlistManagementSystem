package com.cg.iter.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.iter.dto.WishlistDTO;
import com.cg.iter.exception.CrudException;
import com.cg.iter.exception.NullParameterException;
import com.cg.iter.service.WishlistService;


@SpringBootTest
class WishlistMsApplicationTests {
	

	
	@Autowired
	private WishlistService service;
	
	
	
	
	@Test
	public void testAddToWishlist1() throws CrudException{
		
		WishlistDTO wl1=new WishlistDTO("USER023","ITEM945");
		assertTrue(service.addToWishlist(wl1));
	}

	@Test
	public void testAddToWishlist2() throws NullParameterException{
		
		WishlistDTO wishlist=new WishlistDTO("USER024","ITEM946");
		assertTrue(service.addToWishlist(wishlist));
		
	}

	List<WishlistDTO> wishlist1;
	
	@Test
	public void testWishistItems1() throws CrudException{
		List<WishlistDTO> listItems =  service.viewAllProductFromWishList();
		assertNotNull(listItems);
		}
}
