package com.body.GUI;


import com.body.loin.userInFo;

import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.jws.Oneway;
import javax.management.monitor.Monitor;
import javax.swing.*;

public class LoginGUI extends JFrame {



    public static void LoginGUI(){

       // JFrame frame = new JFrame("登录页面");/* 实例化窗体对象*/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Login = new JPanel();
        final JTextField jPasswordField1 = new JTextField(30);
        final JPasswordField jPasswordField2 = new JPasswordField();
        jPasswordField2.setEchoChar('*');
        this.setLayout(null);
        JButton LoginButtons = new JButton("登入");
        LoginButtons.setBounds(10, 70,90 ,30 );
        JButton OutButtons = new JButton("注册");
        OutButtons.setBounds(100, 70,90 ,30 );
        Login.add(OutButtons);
        Monitor m = new Monitor() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
        LoginButtons.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e ) {

                System.out.print(jPasswordField1.getText());
                System.out.print(jPasswordField2.getPassword());
                userInFo nouser = new userInFo(jPasswordField1.getText(),String.valueOf(jPasswordField2.getPassword()));

               //测试对name PASSWORK 的读取
               //这里使用登录接口

                //直接在main中用gettext避免使用字符串获取输入再调用方法
            }
        });
        OutButtons.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e ) {

                //这里使用注册接口
            }
        });

        frame.setVisible(true);
        Login.add(LoginButtons);
        JLabel label1 = new JLabel("用户账号");
        JLabel label2 = new JLabel("密码:");
        label1.setBounds(10, 10, 100, 20);
        label2.setBounds(10, 40, 100, 20);
        jPasswordField1.setBounds(110, 10, 80, 20);
        jPasswordField2.setBounds(110, 40, 50, 20);
        Login.setLayout(null);
        Login.add(label2);
        Login.add(label1);
        Login.add(jPasswordField2);
        Login.add(jPasswordField1);
        Login.setSize(400,150);
        Login.setLocation(0,0);
        setSize(400, 150);
        setLocation(300, 200);
        add(Login);

    }
    public void cansee(){
        setVisible(true);
    }
}
