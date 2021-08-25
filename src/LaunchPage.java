import javax.swing.JFrame;
import javax.swing.JPanel;

public class LaunchPage extends JFrame {
    public LaunchPage () {
        this.setBounds(200,200,412, 150);
        this.setTitle("O MEU PINTINHO PIU");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SearchPanel searchPanel = new SearchPanel();
        this.add(searchPanel);
    }
}
