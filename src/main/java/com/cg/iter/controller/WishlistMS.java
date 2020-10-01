package com.cg.iter.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.dto.WishlistDTO;
import com.cg.iter.exception.NullParameterException;
import com.cg.iter.service.WishlistService;

/*******************************************************************
 * 
 * -------This is a RestController----------
 * 
 *******************************************************************/
@RestController
@RequestMapping("/wishlist")
@CrossOrigin(value = "http://localhost:4200")
public class WishlistMS {

	// ------------Logger Initialized Here------------
	private static final Logger log = LoggerFactory.getLogger(WishlistMS.class);
	@Autowired
	WishlistService service;

	/*******************************************************************
	 * Name : Add to wishlist Description : It will add an item to the wishlist.
	 * Function Name : addToWishlist Input Parameters : Wishlist Object Return Type
	 * : added Product object Throws : Null parameter exception Author : Nitin Kumar
	 * Yadav Created/Modified Date : 27-09-20
	 *******************************************************************/
	@PostMapping("/addToWishlist")
	public String addToWishlist(@RequestBody WishlistDTO addItem) {

		if (addItem == null) {
			log.error("Null request, wishlist details are not provided at /addToWishList");
			throw new NullParameterException("Null request, please provide Wishlist details!");

		}
		String status = "Added to wishlist";
		service.addToWishlist(addItem);
		return status;
	}

	/*******************************************************************
	 * Name - delete item from the wishlist Description - it will delete available
	 * Function Name : deleteProduct Input Parameters : Wishlist Object Return Type
	 * : delted Wishlist object Mapping : PostMapping Throws : Null parameter
	 * exception Author : Nitin Kumar Yadav Created/Modified Date : 27-09-20
	 *******************************************************************/
	@PostMapping("/deleteWishlist")
	public String deleteProduct(@RequestBody WishlistDTO removeItem) {
		if (removeItem == null) {
			log.error("Null request, wishlist details are not provided at /deleteProduct");
			throw new NullParameterException(
					"Null request, please provide wishlist details to remove item from wishlist!");
		}
		String status = "Removed item";
		service.deleteProduct(removeItem);
		return status;
	}

	/*******************************************************************
	 * Name - Show item from the wishlist Description - it will show all available
	 * items from the wishlist Function Name : viewAllProductFromWishList Input
	 * Parameters : Wishlist Object Return Type : list Wishlist objects Mapping :
	 * GetMapping Author : Nitin Kumar Yadav Created/Modified Date : 27-09-20
	 *******************************************************************/
	@GetMapping("/viewAllProducts")
	public List<WishlistDTO> viewAllProductFromWishList() {
		log.info("View All WishList Items Called!!");
		return service.viewAllProductFromWishList();
	}
}
