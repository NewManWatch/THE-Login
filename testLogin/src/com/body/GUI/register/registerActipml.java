package com.body.GUI.register;
import com.body.GUI.client;
import com.body.GUI.clientAct;
import com.body.GUI.Login.loginActipml;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registerActipml  implements clientAct {
    JFrame frame = new JFrame("注册");
    JButton regButton = new JButton("注册");
    JButton breakButton = new JButton("返回");
    client useRegisterWINDOW = new client();
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
    public void action (){
        final JFrame frame = new JFrame("注册");
        JPanel table = new JPanel();
        table.setLayout(null);
        JButton regButton = new JButton("注册");
        JButton breakButton = new JButton("返回");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel labelofusername = new JLabel("用户名：");
        JLabel labelofuserprasswork = new JLabel("密码：");
        JLabel labelofEmail = new JLabel("邮箱");
        JTextField usernameField = new JTextField(30);
        JTextField userEmailFied = new JTextField(40);
        JPasswordField userprassworkField = new JPasswordField();
        userprassworkField.setEchoChar('|');


        breakButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ) {
                  useRegisterWINDOW.getShape("LOGIN").action();
                  frame.dispose();

            }
        });
        userEmailFied.setBounds(150,80,90,30);
        usernameField.setBounds(150,20,90,30);
        userprassworkField.setBounds(150,50,90,30);

        labelofEmail.setBounds(30,80,90,30);
        labelofusername.setBounds(30,20,90,30);
        labelofuserprasswork.setBounds(30,50,90,30);
        regButton.setBounds(30,140,90,30);

        breakButton.setBounds(140, 140,90 ,30 );
        table.add(userEmailFied);
        table.add(usernameField);
        table.add(userprassworkField);
        table.add(labelofusername);
        table.add(labelofuserprasswork);
        table.add(regButton);
        table.add(labelofEmail);
        table.add(breakButton);
        frame.add(table);
        frame.setSize(400, 500);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }

    @Override
    public void watch(boolean now) {
        frame.setVisible(now);

    }
}
