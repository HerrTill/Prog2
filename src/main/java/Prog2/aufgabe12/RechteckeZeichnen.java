package Prog2.aufgabe12;

import javax.swing.*;
import java.awt.*;

public class RechteckeZeichnen extends JFrame {

    public RechteckeZeichnen() {
        Container c = getContentPane();
        Zeichenbrett z = new Zeichenbrett();
        c.add(z);
    }
    public static void main(String[] args) {
        RechteckeZeichnen fenster = new RechteckeZeichnen();
        fenster.setTitle("Rechtecke zeichnen");
        fenster.setSize(250,200);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}