package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Rating;

public interface RatingService {
	
	// create Rating 
	Rating createRating(Rating rating);
	
	// get all Rating
	List<Rating> getAllRating();
	
	// get single rating by RatingId
	Rating getSingleRating(String id);
	
	// delete rating by ratingId
	void deleteByRatingId(String id);
	
	// get all rating byUserId
	List<Rating> getAllRatingByUserId(String userId);
	
	// get all rating by hotelID
	List<Rating> getAllRatingByHotelId(String hotelId);

}
