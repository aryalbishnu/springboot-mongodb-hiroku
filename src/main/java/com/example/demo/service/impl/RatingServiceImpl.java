package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Rating;
import com.example.demo.repo.RatingMongoRepo;
import com.example.demo.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingMongoRepo ratingMongoRepo;

	
	@Override
	public Rating createRating(Rating rating) {
		return ratingMongoRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		return ratingMongoRepo.findAll();
	}

	@Override
	public List<Rating> getAllRatingByUserId(String userId) {
		return ratingMongoRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getAllRatingByHotelId(String hotelId) {	
		return ratingMongoRepo.findByHotelId(hotelId);
	}

	@Override
	public  void deleteByRatingId(String id) {
		ratingMongoRepo.deleteById(id);
	}

	@Override
	public Rating getSingleRating(String id) {
		return ratingMongoRepo.findById(id).get();
	}

}
