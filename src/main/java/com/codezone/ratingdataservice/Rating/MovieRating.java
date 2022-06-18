package com.codezone.ratingdataservice.Rating;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieRating {
    public Integer movieId;
    public double rating;
}