package com.abhishek.service;

import java.util.List;

import com.abhishek.exception.ProductException;
import com.abhishek.modal.Rating;
import com.abhishek.modal.User;
import com.abhishek.request.RatingRequest;

public interface RatingServices {

	public Rating createRating(RatingRequest req, User user) throws ProductException;

	public List<Rating> getProductsRating(Long productId);

}
