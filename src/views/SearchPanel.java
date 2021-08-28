package views;

import controllers.MovieController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchPanel extends JPanel {
    private JTextField movieName = new JTextField();
    private JButton clear = new JButton("✕");
    private JButton search = new JButton("Search");

    public SearchPanel() {
        setLayout(null);
        this.movieName.setBounds(20,30,300, 30);
        //movie_name.putClientProperty("JComponent.sizeVariant", "large");
        this.add(movieName);

        this.clear.setBounds(322,30,70,29);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent action) {
                movieName.setText("");
            }
        });
        this.add(clear);

        this.search.setBounds(20,65,372,29);
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent action) {
                String title = movieName.getText();
                MovieController.search(title);
            }
        });
        this.add(search);
    }
}
