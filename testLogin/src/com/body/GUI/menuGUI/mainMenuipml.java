package com.body.GUI.menuGUI;

import javax.swing.*;
import com.body.GUI.clientAct;
public class mainMenuipml implements clientAct{

    @Override
    public void action() {
        JFrame mainmenu = new JFrame("自动评论机器人");

        JPanel menutable = new JPanel();
        menutable.setLayout(null);






        /**/
        mainmenu.setSize(400, 500);
        mainmenu.setLocation(200, 200);



        /**/
        mainmenu.add(menutable);
        /**/
        mainmenu.setVisible(true);








    }

    @Override
    public void watch(boolean now) {

    }






}
