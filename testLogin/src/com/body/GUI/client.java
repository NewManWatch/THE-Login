package com.body.GUI;
import com.body.GUI.Login.loginActipml;//
import com.body.GUI.register.registerActipml;//
public class client {

    public clientAct getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("LOGIN")){
            return new loginActipml();
        } else if(shapeType.equalsIgnoreCase("REGISTER")){
            return new registerActipml();
        }
        return null;
    }
}
