package com.microservices.ratingservice.controller;

import com.microservices.ratingservice.entity.Rating;
import com.microservices.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    // create rating controller
    @PostMapping("/")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        Rating createdRating = ratingService.createRating(rating);
        return new ResponseEntity<>(createdRating, HttpStatus.CREATED);
    }

    // Get all ratings
    @GetMapping("/")
    public ResponseEntity<List<Rating>> getAllRating(){
        List<Rating> allRatings = ratingService.getAllRating();
        return new ResponseEntity<>(allRatings, HttpStatus.FOUND);
    }

    // Get ratings by userId
    @GetMapping("/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUser(@PathVariable String userId){
        List<Rating> allRatingByUser = ratingService.getAllRatingByUserId(userId);
        return new ResponseEntity<>(allRatingByUser, HttpStatus.FOUND);
    }

    // Get ratings by hotelId
    @GetMapping("/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotel(@PathVariable String hotelId){
        List<Rating> allRatingByHotel = ratingService.getAllRatingByHotelId(hotelId);
        return new ResponseEntity<>(allRatingByHotel, HttpStatus.FOUND);
    }

}
