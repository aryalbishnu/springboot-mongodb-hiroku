package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Rating;

public interface RatingMongoRepo extends MongoRepository<Rating, String>{
	//Custom finder method

	void deleteById(String id);
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
}
