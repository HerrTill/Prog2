package Prog2.aufgabe12;


import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Zeichenbrett extends JPanel{
    int[] x1 = new int[1000];
    int[] y1= new int[1000];
    int[] height= new int[1000];
    int[] width= new int[1000];
    int n=0;
    public Zeichenbrett() {
        addMouseListener(new ClickBearbeiter());
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i<n ; i++) {
            g.drawRect(x1[i], y1[i], width[i], height[i]);
        }
    }
    class ClickBearbeiter extends MouseAdapter  {

        public void mousePressed(MouseEvent e) {
            x1[n] = e.getX();
            y1[n] = e.getY();
        }

        public void mouseReleased(MouseEvent e) {
            if (e.getY() < y1[n] && e.getX() < x1[n]) {
                height[n] = Math.abs(y1[n] - e.getY());
                width[n] = Math.abs(x1[n] - e.getX());
                x1[n] = e.getX();
                y1[n] = e.getY();
            }else if(e.getY() < y1[n] && e.getX() >= x1[n]) {
                height[n] = Math.abs(y1[n] - e.getY());
                width[n] = Math.abs(e.getX() - x1[n]);
                y1[n] = e.getY();
            }else if(e.getY() >= y1[n] && e.getX() < x1[n]) {
                height[n] = Math.abs(e.getY() - y1[n]);
                width[n] = Math.abs(x1[n] - e.getX());
                x1[n] = e.getX();
            }else {
                height[n] = e.getY() - y1[n];
                width[n] = e.getX() - x1[n];
            }
            n++;
            repaint();
        }
    }

}
