package com.body.util.data.Login;
import com.body.GUI.menuGUI.Adminmenu;
import com.body.loin.userInFo;
import com.body.util.data.user.UserRide;
import com.body.GUI.*;

public class LoginVerifier {
    client useRegisterWINDOW = new client();
    public void Verifier(userInFo user){
        StringBuilder verifierinformation = new StringBuilder(user.getusername()+"\n"+user.getuserpassword());
        UserRide userRide = new UserRide();
        StringBuilder Admin = new StringBuilder("admin"+"\n"+"admin");
        if (verifierinformation.toString().equals(Admin.toString())==true){

            Adminmenu adminmenu = new Adminmenu();
            adminmenu.action();
        } else  if (verifierinformation.toString().equals(userRide.Ridetxt(user.getusername()))){

            useRegisterWINDOW.getShape("MENU").action();

        }else {
            System.out.print("登录失败");
            System.out.print(userRide.Ridetxt(user.getusername()));
            //记录log ：time ip user
        }

    }
}
