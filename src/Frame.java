import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
    public Frame () {
        this.setBounds(200,200,400, 150);
        this.setTitle("O MEU PINTINHO PIU");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel1 = new Panel();
        this.add(painel1);
    }
}
