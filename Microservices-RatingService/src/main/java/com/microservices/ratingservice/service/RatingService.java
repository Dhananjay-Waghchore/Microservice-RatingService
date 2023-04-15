package com.microservices.ratingservice.service;

import com.microservices.ratingservice.entity.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    // Create Rating
    Rating createRating(Rating rating);

    // Get all rating
    List<Rating> getAllRating();

    // Get rating by userId
    List<Rating> getAllRatingByUserId(String userId);

    // Get raying by hotelId
    List<Rating> getAllRatingByHotelId(String hotelId);

}
