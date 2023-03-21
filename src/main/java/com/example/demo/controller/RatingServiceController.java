package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Rating;
import com.example.demo.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingServiceController {
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping()
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		return new ResponseEntity<Rating>(ratingService.createRating(rating), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Rating>> getAllRating(){
		return new ResponseEntity<List<Rating>>(ratingService.getAllRating(), HttpStatus.OK);
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingByUserId(@PathVariable String userId){
		return new ResponseEntity<List<Rating>>(ratingService.getAllRatingByUserId(userId), HttpStatus.OK);
	}
	
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getAllRatingByHotelId(@PathVariable String hotelId){
		return new ResponseEntity<List<Rating>>(ratingService.getAllRatingByHotelId(hotelId), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> ratingDeleteById(@PathVariable String id){
		ratingService.deleteByRatingId(id);
		return new ResponseEntity<String>("delete success full..", HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Rating> getSingleRating(@PathVariable String id){
		return new ResponseEntity<Rating>(ratingService.getSingleRating(id), HttpStatus.OK);
	}

}
