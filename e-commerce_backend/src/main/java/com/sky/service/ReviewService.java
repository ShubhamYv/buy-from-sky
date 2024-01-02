package com.sky.service;

import java.util.List;

import com.sky.exception.ProductException;
import com.sky.modal.Review;
import com.sky.modal.User;
import com.sky.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
