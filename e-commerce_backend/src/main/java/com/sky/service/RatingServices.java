package com.sky.service;

import java.util.List;

import com.sky.exception.ProductException;
import com.sky.modal.Rating;
import com.sky.modal.User;
import com.sky.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
