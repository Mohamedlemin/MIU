package FPP.Lesson5.SwingLAB.Lab6.assigment2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingApp implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JTextField inputField;
    private JTextField outputField;
    private JButton countButton;
    private JButton reverseButton;
    private JButton removeDupButton;

    public SwingApp() {
        frame = new JFrame("Swing App");
        panel = new JPanel();
        inputField = new JTextField(20);
        outputField = new JTextField(20);
        countButton = new JButton("Count Letters");
        reverseButton = new JButton("Reverse Letters");
        removeDupButton = new JButton("Remove Duplicates");


        countButton.addActionListener(this);
        reverseButton.addActionListener(this);
        removeDupButton.addActionListener(this);


        panel.add(new JLabel("Input:"));
        panel.add(inputField);
        panel.add(new JLabel("Output:"));
        panel.add(outputField);
        panel.add(countButton);
        panel.add(reverseButton);
        panel.add(removeDupButton);

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        if (e.getSource() == countButton) {
            int count = input.length();
            outputField.setText("Count: " + count);
        } else if (e.getSource() == reverseButton) {
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            outputField.setText(sb.toString());
        } else if (e.getSource() == removeDupButton) {
            HashSet<Character> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (!set.contains(c)) {
                    set.add(c);
                    sb.append(c);
                }
            }
            outputField.setText(sb.toString());
        }
    }

    public static void main(String[] args) {
        new SwingApp();
    }
}

