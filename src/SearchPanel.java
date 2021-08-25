import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchPanel extends JPanel {
    private JTextField movie_name_field = new JTextField();
    private JButton clear = new JButton("✕");
    private JButton search = new JButton("Pesquisar");

    public SearchPanel() {
        setLayout(null);
        this.movie_name_field.setBounds(20,30,300, 30);
        //movie_name.putClientProperty("JComponent.sizeVariant", "large");
        this.add(movie_name_field);

        this.clear.setBounds(322,30,70,29);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent action) {
                movie_name_field.setText("");
            }
        });
        this.add(clear);

        this.search.setBounds(20,65,372,29);
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent action) {
                String movie_name = movie_name_field.getText();
                System.out.println(movie_name);
                MovieShow showMovie = new MovieShow();
            }
        });
        this.add(search);
    }
}
