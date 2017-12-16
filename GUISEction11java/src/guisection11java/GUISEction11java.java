/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guisection11java;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author muhammad
 */
public class GUISEction11java extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame n=new GUISEction11java();
       n.setSize(1024, 600);
       n.setVisible(true);
       n.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

      GUISEction11java(){
        setLayout(new GridLayout(1,2));
        add(new JButton("1rtretr"));
        JPanel p1=new JPanel();
        
        JPanel p2=new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(new JTextField("dfsfd"),BorderLayout.NORTH);
        p1.add(p2,BorderLayout.CENTER);
        p2.setLayout(new GridLayout(3,3));
        
        p2.add(new JButton("1"));
        p2.add(new JButton("1"));
        p2.add(new JButton("1"));
        p2.add(new JButton("1"));
        p2.add(new JButton("1"));
        p2.add(new JButton("1"));
        p2.add(new JButton("1"));
        p2.add(new JButton("1"));
        
          add(p1);
    }
    
}

