package tester.lambdaPratice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ButtonClickedLambda {
    public static void main(String[] args) {
        JFrame frame=new JFrame("New Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        //creating buttons
        Button btn=new Button("Click me!!");
        btn.addActionListener((ActionEvent e)->{
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null,"Button Clicked!! :) ");
        });
        //You cannot add mouse motion listener by using lambda because it is not functional interface
        frame.add(btn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
