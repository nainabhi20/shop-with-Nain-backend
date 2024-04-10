package com.abhishek.service;

import com.abhishek.exception.ProductException;
import com.abhishek.modal.Cart;
import com.abhishek.modal.CartItem;
import com.abhishek.modal.User;
import com.abhishek.request.AddItemRequest;

public interface CartService {

	public Cart createCart(User user);

	public CartItem addCartItem(Long userId, AddItemRequest req) throws ProductException;

	public Cart findUserCart(Long userId);

}
