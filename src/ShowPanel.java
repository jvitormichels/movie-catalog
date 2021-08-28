import javax.swing.*;

public class ShowPanel extends JPanel {
    //title.setBounds(1,1,412, 20);
    ShowPanel(Movie movie) {
        setLayout(null);

        JLabel title = new JLabel(movie.Title);
        title.setBounds(50, 20, 450, 30);
        this.add(title);

        JTextArea plot = new JTextArea(movie.Plot, 15, 15);
        plot.setBounds(200, 200, 450, 120);
        plot.setEditable(false);
        this.add(plot);
    }
}
