import javax.swing.*;

public class MovieShow extends JFrame {
    MovieShow (Movie movie) {
        this.setBounds(650, 50, 700, 700);
        this.setTitle(movie.getTitle());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ShowPanel showPanel = new ShowPanel(movie);
        this.add(showPanel);
    }
}
