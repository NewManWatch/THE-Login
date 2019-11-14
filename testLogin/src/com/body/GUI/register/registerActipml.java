package com.body.GUI.register;
import com.body.GUI.clientAct;
import com.body.GUI.Login.loginActipml;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registerActipml  implements clientAct {
    JFrame frame = new JFrame("注册");
    JButton regButton = new JButton("注册");
    JButton breakButton = new JButton("返回");
    public JFrame getFrame() {
        return frame;
    }
    public JButton getBoolean(String ButtonID ){






        return null;
    }//通过getboolean 在逻辑类中添加需要的监听
    public JButton findBoolean(String ButtonID){

            if (ButtonID.equals("REGISTER")){

                return regButton;
            }else if (ButtonID.equals("BREAK")){
                return breakButton;
            }else{
                return null;
            }


    }

    @Override
    public void action (clientAct useLoginWINDOW){
        JFrame frame = new JFrame("注册");
        JPanel table = new JPanel();
        JButton regButton = new JButton("注册");
        JButton breakButton = new JButton("返回");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLocation(20, 20);
        frame.setVisible(true);//问题1：为什么把这里的t改成f然后后面LoginActpml的注册打开的窗口就是一个没有东西的窗口
        regButton.setBounds(100,70,90,30);
        regButton.setBounds(100, 70,90 ,30 );
        regButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ) {

            }
        });
        table.add(regButton);
        table.add(breakButton);
        frame.add(table);
    }

    @Override
    public void watch(boolean now) {
        frame.setVisible(now);

    }
}
