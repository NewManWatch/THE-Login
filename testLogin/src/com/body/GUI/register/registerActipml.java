package com.body.GUI.register;
import com.body.GUI.clientAct;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registerActipml implements clientAct{
    @Override
    public void state() {

    }

    JFrame frame = new JFrame();
    @Override
    public void action(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLocation(20, 20);
        frame.setVisible(true);
        final JButton registerBreak = new JButton();
        registerBreak.setBounds(100, 70,90 ,30 );
        registerBreak.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ) {

            }
        });
        frame.add(registerBreak);
        frame.setVisible(true);
    }
    public void watchOpen(){
        frame.setVisible(true);
    }
    public void watchoff(){
        frame.setVisible(false);

    }
}
