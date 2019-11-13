package com.body.GUI;


public class logicForGUI {
    public static void into(){

        client one = new client();

        clientAct testLogin = one.getShape("LOGIN");
        testLogin.action();
        testLogin.action();

        clientAct test= one.getShape("REGISTER");
        test.action();





    }




}
