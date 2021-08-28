package views;

import models.Movie;
import javax.swing.*;
import java.awt.*;

public class ShowPanel extends JPanel {
    ShowPanel(Movie movie) {
        setLayout(null);

        JLabel title = new JLabel(movie.getTitle());
        title.setBounds(50, 20, 450, 30);
        this.add(title);

        JLabel details = new JLabel(movie.getGenre() + " / " + movie.getRuntime() + " / " + movie.getYear());
        details.setBounds(50, 60, 450, 30);
        this.add(details);

        JLabel director = new JLabel("Directed by: " + movie.getDirector());
        director.setBounds(50, 80, 450, 30);
        this.add(director);

        JLabel writer = new JLabel("Writer: " + movie.getWriter());
        writer.setBounds(50, 100, 450, 30);
        this.add(writer);

        JLabel actors = new JLabel("Cast: " + movie.getActors());
        actors.setBounds(50, 120, 450, 30);
        this.add(actors);

        JLabel plotLabel = new JLabel("Plot");
        plotLabel.setBounds(50, 150, 450, 30);
        this.add(plotLabel);

        JTextArea plot = new JTextArea(movie.getPlot(), 15, 15);
        plot.setBackground(new Color(0,0,0,0));
        plot.setBounds(50, 180, 450, 120);
        plot.setEditable(false);
        plot.setLineWrap(true);
        plot.setWrapStyleWord(true);
        this.add(plot);
    }
}
