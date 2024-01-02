package com.sky.service;

import com.sky.exception.ProductException;
import com.sky.modal.Cart;
import com.sky.modal.User;
import com.sky.request.AddItemRequest;

public interface CartService {

	public Cart createCart(User user);

	public String addCartItem(Long userId, AddItemRequest req) throws ProductException;

	public Cart findUserCart(Long userId);

}
