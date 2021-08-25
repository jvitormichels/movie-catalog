import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Panel extends JPanel {
    private JTextField movie_name_field = new JTextField();
    private JButton search = new JButton("Pesquisar");

    public Panel() {
        setLayout(null);
        this.movie_name_field.setBounds(20,30,220, 30);
        //movie_name.putClientProperty("JComponent.sizeVariant", "large");
        this.add(movie_name_field);

        this.search.setBounds(242,30,120,29);
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent action) {
                String movie_name = movie_name_field.getText();
                System.out.println(movie_name);
            }
        });
        this.add(search);
    }
}
