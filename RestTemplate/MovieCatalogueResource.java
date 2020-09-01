package io.monikxz.moviecatalogservice.resources;

import io.monikxz.moviecatalogservice.models.CatalogItem;
import io.monikxz.moviecatalogservice.models.Movie;
import io.monikxz.moviecatalogservice.models.Rating;
import io.monikxz.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
    {
 //       RestTemplate restTemplate = new RestTemplate();
       // Movie movie =
        //get all rated movie ids
       //UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/users/"+userId, UserRating.class);
        UserRating ratings = restTemplate.getForObject("http://rating-data-service/ratingsdata/users/"+userId, UserRating.class);
        return ratings.getUserRating().stream().map(rating-> {
         // Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
          return new CatalogItem(movie.getName(), "movie desc",rating.getRating());
        })
                .collect(Collectors.toList());

        //for each movie id call movie info service and get details


        //put them all together.




    }
}
