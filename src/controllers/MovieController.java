package controllers;

import exceptions.MovieNotFoundException;
import models.Movie;
import services.MovieService;
import views.Alert;
import views.MovieShow;

public class MovieController {
    public static void search(String title) {
        try {
            Movie movie = MovieService.search(title);
            new MovieShow(movie);
        }
        catch (Exception e) {
            new Alert(e.getMessage());
        }
    }
}
