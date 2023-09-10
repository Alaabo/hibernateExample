package view;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    JFrame frame = new JFrame("CRUD");
     JPanel container;
     JLabel welcome = new JLabel("WELCOME");


    public GUI() {

        // creating instance of JFrame with name "first way"
        frame=new JFrame("first way");

        // creates instance of JButton
        JButton button = new JButton("let's see");
        JTable etudiant = new JTable();
        JLabel id = new JLabel("ID");
        JLabel nom = new JLabel("NOM");
        JLabel control = new JLabel("Controle");
        JLabel intero = new JLabel("interogation");
        JTextField idField = new JTextField();
        JTextField nomField = new JTextField();
        JTextField controlField = new JTextField();
        JTextField interoField = new JTextField();



        button.setBounds(200, 150, 90, 50);

        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adds button in JFrame
        frame.add(button);

        // sets 500 width and 600 height
        frame.setSize(500, 600);

        // uses no layout managers
        frame.setLayout(null);

        // makes the frame visible
        frame.setVisible(true);
    }

    //////////////////
    public static void main(String[] args) {
        new GUI();
    }
}
