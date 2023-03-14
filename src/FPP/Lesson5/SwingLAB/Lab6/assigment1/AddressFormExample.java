package FPP.Lesson5.SwingLAB.Lab6.assigment1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressFormExample extends JFrame implements ActionListener {

    private JTextField nameField;
    private JTextField streetField;
    private JTextField cityField;
    private JTextField stateField;
    private JTextField zipField;

    public AddressFormExample() {
        setTitle("Address Form Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        JLabel nameLabel = new JLabel("Name:");
        add(nameLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        nameField = new JTextField(20);
        add(nameField, c);

        c.gridx = 0;
        c.gridy = 1;
        JLabel streetLabel = new JLabel("Street:");
        add(streetLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        streetField = new JTextField(20);
        add(streetField, c);

        c.gridx = 0;
        c.gridy = 2;
        JLabel cityLabel = new JLabel("City:");
        add(cityLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        cityField = new JTextField(20);
        add(cityField, c);

        c.gridx = 0;
        c.gridy = 3;
        JLabel stateLabel = new JLabel("State:");
        add(stateLabel, c);

        c.gridx = 1;
        c.gridy = 3;
        stateField = new JTextField(20);
        add(stateField, c);

        c.gridx = 0;
        c.gridy = 4;
        JLabel zipLabel = new JLabel("Zip:");
        add(zipLabel, c);

        c.gridx = 1;
        c.gridy = 4;
        zipField = new JTextField(20);
        add(zipField, c);

        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton, c);

        setLocationRelativeTo(null);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String street = streetField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String zip = zipField.getText();

        System.out.println("Name: " + name);
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip: " + zip);
    }

    public static void main(String[] args) {
        new AddressFormExample();
    }
}
