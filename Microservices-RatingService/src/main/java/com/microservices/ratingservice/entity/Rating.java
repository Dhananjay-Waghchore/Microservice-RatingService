package com.microservices.ratingservice.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private String ratingId;
    private int rating;
    private String userId;
    private String hotelId;
    private String feedback;

}