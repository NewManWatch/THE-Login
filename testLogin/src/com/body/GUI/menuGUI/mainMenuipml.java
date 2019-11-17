package com.body.GUI.menuGUI;

import javax.swing.*;
import com.body.GUI.clientAct;
import netscape.security.UserTarget;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenuipml implements clientAct{

    @Override
    public void action() {
        JFrame mainmenu = new JFrame("自动评论机器人");

        final JPanel menutable = new JPanel();
        final JPanel fileMenu = new JPanel();
       // fileMenu.setLayout(null);
        menutable.setLayout(null);


        JButton file = new JButton("文件");
        JButton fileMenuOff = new JButton("文件");
        JButton edit = new JButton("编辑");
        JButton view = new JButton("视图");














        /*初始化位置*/
        mainmenu.setSize(400, 500);
        mainmenu.setLocation(200, 200);
        fileMenu.setBounds(0,0,60,120);
        file.setBounds(0,0,60,30);
        fileMenuOff.setBounds(0,0,60,30);
        edit.setBounds(60,0,60,30);
        view.setBounds(120,0,60,30);


        /*事件*/
        file.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ) {
                fileMenu.setVisible(true);



            }
        });
        fileMenuOff.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ) {
                fileMenu.setVisible(false);



            }
        });














        /*组件添加*/
        mainmenu.add(menutable);
        menutable.add(fileMenu);
        menutable.add(file);
        menutable.add(edit);
        menutable.add(view);
        fileMenu.add(fileMenuOff);

        /*除了位置的初始化数据*/
        mainmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainmenu.setVisible(true);
        menutable.setVisible(true);
        fileMenu.setVisible(false);
        fileMenu.setBackground(Color.green);







    }

    @Override
    public void watch(boolean now) {

    }






}
