package views;

import controllers.MovieController;

import javax.swing.*;
import java.awt.event.*;

public class SearchPanel extends JPanel {
    private JTextField movieName = new JTextField();
    private JButton clear = new JButton("✕");
    private JButton search = new JButton("Search");

    public SearchPanel() {
        setLayout(null);

        JLabel titleLabel = new JLabel("Enter the movie title:");
        titleLabel.setBounds(20, 10, 450, 30);
        this.add(titleLabel);

        movieName.setBounds(20,40,300, 30);
        movieName.addKeyListener(submitKeyListener);
        this.add(movieName);

        clear.setBounds(322,40,70,29);
        clear.addActionListener(clearActionListener);
        this.add(clear);

        search.setBounds(20,72,372,29);
        search.addActionListener(submitActionListener);
        this.add(search);
    }

    public void search() {
        String title = movieName.getText();
        MovieController.search(title);
    }

    ActionListener clearActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            movieName.setText("");
        }
    };

    ActionListener submitActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            search();
        }
    };

    KeyListener submitKeyListener = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                search();
            }
        }
    };
}
