package com.body.util.data.Login;
import com.body.GUI.client;
import com.body.GUI.register.*;
import com.body.loin.userInFo;
import com.body.util.data.user.DateBuildimpl;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CoverUser  {
    JFrame frame = new JFrame("管理员菜单");
    JButton regButton = new JButton("修改");
    client useRegisterWINDOW = new client();
    public void action (){
        JPanel table = new JPanel();
        table.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel labelofusername = new JLabel("用户名：");
        final JLabel labelofuserprasswork = new JLabel("密码：");
        JLabel labelofEmail = new JLabel("邮箱");
        final JTextField usernameField = new JTextField(30);
        JTextField userEmailFied = new JTextField(40);
        final JTextField userprassworkField = new JTextField();
        regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userpasswork = String.valueOf(userprassworkField.getText());
                userInFo userInFo = new userInFo(usernameField.getText(),userpasswork);
                DateBuildimpl dateBuildimpl = new DateBuildimpl();
                dateBuildimpl.builenewuser(userInFo);
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
        table.add(userEmailFied);
        table.add(usernameField);
        table.add(userprassworkField);
        table.add(labelofusername);
        table.add(labelofuserprasswork);
        table.add(regButton);
        table.add(labelofEmail);
        frame.add(table);
        frame.setSize(400, 500);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }

}
