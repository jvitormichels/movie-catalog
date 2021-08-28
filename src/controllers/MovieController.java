package controllers;

import models.Movie;
import services.MovieService;
import views.MovieShow;

public class MovieController {
    public static void search(String title) {
        try {
            Movie movie = MovieService.search(title);
            new MovieShow(movie);
        }
        catch (Exception e) {
            //janela de aviso
        }
    }
}
