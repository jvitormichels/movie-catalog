package views;

import javax.swing.JFrame;

public class LaunchPage extends JFrame {
    public LaunchPage () {
        this.setBounds(200,200,412, 150);
        this.setTitle("Movie Catalog");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SearchPanel searchPanel = new SearchPanel();
        this.add(searchPanel);
    }
}
