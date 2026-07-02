package Lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollingBall extends JPanel implements ActionListener{
    int x = 100, startAngle = 0;
    
     public RollingBall() {
        Timer timer = new Timer(50, this);
        timer.start();
     }

     public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,90,80,80);
        g.fillArc(x, 90, 80, 80, startAngle, 180);
    }
    public void actionPerformed(ActionEvent e) {
        x -= 2;
        startAngle += 2;
        if (x == -80) x = getWidth();
        if (startAngle > 360) startAngle = 0;
        paintComponent(getGraphics());
    }
    

}
