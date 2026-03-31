import javax.swing.*;
import java.awt.*;

public class FirstGraphiApp {
    public static void main(String[] args) {
        //Créer une new fenetre
        JFrame  jf= new JFrame("TITRE");

        //Creer les composant
        JLabel l = new JLabel("nom");
        JTextField t = new JTextField(12);
        JButton b = new JButton("OK");

        //Definir la technique de mise en page
        jf.setLayout(new FlowLayout());
        //Ajout des composant à la fenetre
        jf.add(l); jf.add(t); jf.add(b);

        //definition de la dimmension de la fentre
        jf.setBounds(10, 10, 400, 400);

        //Afficher la fentre
        jf.setVisible(true);
    }
}
