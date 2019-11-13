package com.body.GUI.Login;
import com.body.GUI.*;
import com.body.loin.userInFo;

import javax.management.monitor.Monitor;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginActipml implements clientAct{
    static JFrame frame;

    @Override
    public void state() {

    }

    @Override
    public void action(){

        frame = new JFrame("登录页面");/* 实例化窗体对象*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Login = new JPanel();
        final JTextField jPasswordField1 = new JTextField(30);
        final JPasswordField jPasswordField2 = new JPasswordField();
        jPasswordField2.setEchoChar('*');
        frame.setLayout(null);
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
        LoginButtons.addActionListener(new ActionListener(){
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
        frame.setSize(400, 150);
        frame.setLocation(300, 200);
        frame.add(Login);




    }
    public void watchOpen(){
        frame.setVisible(true);
    }
    public void watchoff(){
        frame.setVisible(false);

    }


}
