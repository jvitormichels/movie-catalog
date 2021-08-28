package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alert extends JFrame {
    private JLabel errorDescription;
    private JButton okButton = new JButton("Ok");

    public Alert (String error) {
        setLayout(null);
        this.setBounds(460, 280, 400, 150);
        this.setTitle("Error");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        errorDescription = new JLabel(error);
        this.errorDescription.setBounds(130,15,300, 30);
        this.add(errorDescription);

        this.okButton.setBounds(150,65,70,29);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent action) {
                Alert.this.dispose();
            }
        });
        this.add(okButton);
    }
}
