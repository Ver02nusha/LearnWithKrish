/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twobuttons;

/**
 *
 * @author Vernu Ravi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class TwoButtons {
    JFrame frame;
    JLabel label;
 
    public static void main(String[] args)
    {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }
 
    public void go()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JButton labelButton = new JButton("Change label");
        labelButton.addActionListener(new LabelListener());
 
        JButton colorButton = new JButton("Change circle");
        labelButton.addActionListener(new ColorListener());
 
        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();
 
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
 
        frame.setSize(400,300);
        frame.setVisible(true);
    }
     
    class LabelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            label.setText("Ouch!");
        }
    }
 
    class ColorListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            frame.repaint();
        }
    }
 
}
 
class MyDrawPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
 
        g2d.setColor(randomColor());
        g2d.fillRect(0,0,this.getWidth(), this.getHeight());
 
        GradientPaint gradient = new GradientPaint(70,70,randomColor(),
            150,150,randomColor() );
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }
 
    public Color randomColor()
    {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color randomColor = new Color(red, green, blue);
        return randomColor;
    }
}
