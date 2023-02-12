package tester.anonymousClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ButtonClickedEvents {
    public static void main(String[] args) {

        //Creating a window frame
        JFrame frame=new JFrame("My window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());


        //Creating button
        Button btn=new Button("Click Me!!");
        //ActionListener is a functional Interface with one method actionPerformed
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked !!");
                JOptionPane.showMessageDialog(null,"Button Clicked");
            }
        });
        frame.add(btn);

        btn.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
