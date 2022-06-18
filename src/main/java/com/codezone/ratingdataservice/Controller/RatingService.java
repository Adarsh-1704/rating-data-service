package com.codezone.ratingdataservice.Controller;

import com.codezone.ratingdataservice.Rating.MovieRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/")
public class RatingService {

    @GetMapping("/Rating")
    public List<MovieRating> getMovieList(@RequestParam String userId){

        List<MovieRating> listA = new ArrayList<>();
        List<MovieRating> listB = new ArrayList<>();
        List<MovieRating> listC = new ArrayList<>();
        MovieRating m1 = new MovieRating(1,4.5);
        MovieRating m2 = new MovieRating(2,4.8);
        MovieRating m3 = new MovieRating(3,4.3);
        MovieRating m4 = new MovieRating(4,4.6);
        MovieRating m5 = new MovieRating(5,5.0);
//        User userA = new User("user1");
//        User userB = new User("user2");
//        User userC = new User("user3");
        listA.add(m1);
        listA.add(m3);
        listA.add(m5);
        listB.add(m2);
        listB.add(m3);
        listB.add(m4);
        listB.add(m5);
        listC.add(m1);
        listC.add(m3);
        listC.add(m4);
        Map<String,List<MovieRating>> map = new HashMap<>();
        map.put("user1",listA);
        map.put("user2",listB);
        map.put("user3",listC);
        return map.get(userId);
    }
}