package com.liddhome.service;

import java.util.List;
import com.liddhome.entity.CartItem;

public interface CartItemService {
	
	public List<CartItem> loadCartItems(String cartItemIds);
	
	public CartItem updateQuantity(String cartItemId,int quantity);
	
	public void batchDelete(String cartItemIds);
	
	public void add(CartItem cartItem);
	
	public List<CartItem> myCart(String uid);
}
