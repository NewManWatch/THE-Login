package com.body.GUI;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class logicForGUI {
    public static void into(){


        final client one = new client();
       // client two = new client();
        final clientAct testRE    = one.getShape("REGISTER");//注册窗口不可见
        final clientAct testLogin = one.getShape("LOGIN");
        testLogin.action();






    }




}
