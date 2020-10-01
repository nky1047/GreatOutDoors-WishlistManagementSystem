package com.cg.iter.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.dto.WishlistDTO;
import com.cg.iter.exception.CrudException;
import com.cg.iter.repository.WishlistRepository;

/*******************************************************************
 * 
 * SERVICE IMPLEMENTATION CLASS
 * 
 *******************************************************************/
@Service

public class WishlistServiceImpl implements WishlistService {

	@Autowired
	WishlistRepository repository;

	/*******************************************************************
	 * Name : Add to wishlist 
	 * Description : It will add an item to the wishlist.
	 * Function Name            :     addToWishlist
	 * Input Parameters         :     Wishlist Object
	 * Return Type              :     added Product object
	 * Author                   :     Nitin Kumar Yadav
	 * Created/Modified Date    :     27-09-20
	 *******************************************************************/
	@Override
	public boolean addToWishlist(WishlistDTO addItem) {

		repository.save(addItem);

		return true;
	}

	/*******************************************************************
	 * Name - delete item from the wishlist Description - it will delete available 
	 * Function Name : deleteProduct Input Parameters : Wishlist Object Return Type
	 * : delted Wishlist object Author : Nitin Kumar Yadav Created/Modified Date :
	 * 27-09-20
	 *******************************************************************/
	@Override
	public boolean deleteProduct(WishlistDTO removeItem) {
		
		repository.delete(removeItem);
		
		return true;
	}

	/*******************************************************************
	 * Name - Show item from the wishlist 
	 * Description - it will show all available items from the wishlist
	 * Function Name            :     viewAllProductFromWishList
	 * Input Parameters         :     Wishlist Object
	 * Return Type              :     list Wishlist objects
	 * Author                   :     Nitin Kumar Yadav
	 * Created/Modified Date    :     27-09-20
	 *******************************************************************/
	@Override
	public List<WishlistDTO> viewAllProductFromWishList() {
		
		if (repository.count() == 0)
			throw new CrudException("Please add items to wishlist");
		
		List<WishlistDTO> listWishListItems = (List<WishlistDTO>) repository.findAll();
		
		return listWishListItems;
	}

}
