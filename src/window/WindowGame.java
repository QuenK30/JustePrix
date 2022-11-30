package window;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class WindowGame {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int random = (int) (Math.random() * (max - min + 1) + min);
        createWindow(random);
    }

    public static void createWindow(int random) {
        JFrame window = new JFrame("Le Juste Prix par QuenK");
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        JPanel panel = new JPanel();
        window.add(panel);

        JLabel label = new JLabel("Entrez un nombre entre 0 et 10");
        panel.add(label);

        JTextField textField = new JTextField(20);
        textField.setBounds(180, 60, 105, 25);
        textField.setToolTipText("Entrez un nombre entre 0 et 10");
        panel.add(textField);

        JButton button = new JButton("Valider");
        button.setBounds(180, 80, 105, 25);
        panel.add(button);

        button.addActionListener((ActionEvent e) -> {
            int guess = Integer.parseInt(textField.getText());
            if (guess == random) {
                JOptionPane.showMessageDialog(null, "Bravo ! Le nombre était " + random);
                System.exit(0);
            } else if (guess > random) {
                JOptionPane.showMessageDialog(null, "Le nombre est plus petit");
            } else {
                JOptionPane.showMessageDialog(null, "Le nombre est plus grand");
            }
        });

    }

}
