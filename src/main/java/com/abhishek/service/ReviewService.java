package com.abhishek.service;

import java.util.List;

import com.abhishek.exception.ProductException;
import com.abhishek.modal.Review;
import com.abhishek.modal.User;
import com.abhishek.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req, User user) throws ProductException;

	public List<Review> getAllReview(Long productId);

}
