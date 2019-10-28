package com.body.loin;
import java.util.Scanner;/*
 *下午 17:13
 *
 */

public class bodyInFaImpl implements bodyInFa {
    @Override
    public void userLogin(userInFo user) {

    }

    @Override
    public userInFo userRegister(userInFo user) {

        userInFo getuser = new userInFo();
        Scanner scan =new Scanner(System.in );
        System.out.print("pleasr cin you went name");
        getuser.setusername(scan.next());
        dateInFaImpl dateInFa = new dateInFaImpl();
        if (dateInFa.findUser(getuser).getusername()=="NULL"){

        }else {
            System.out.print("错误 ：已经存在该用户");
        }


        return null;
    }

    @Override
    public userInFo forget(userInFo user) {
        return null;
    }
}
