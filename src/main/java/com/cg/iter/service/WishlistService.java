package com.cg.iter.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.iter.dto.ProductDTO;
import com.cg.iter.dto.WishlistDTO;


public interface WishlistService {
	
	/******************************************************************
	 * Name - add to wishlist
	 * Description - It will add an item to the wishlist.
	 ******************************************************************/
	boolean addToWishlist(WishlistDTO addItem) ;
	
	
	/******************************************************************
	 * Name - delete item from the wishlist
	 * Description - it will delete available item from the wishlist
	 *****************************************************************/
	boolean deleteProduct(WishlistDTO removeItem);
	
	
		
	 /******************************************************************
     * Name - ShowProductsFromWishlist
     * Description - Shows all products in the wishlist
     ******************************************************************/
	List<WishlistDTO> viewAllProductFromWishList() ;
	
	
}
