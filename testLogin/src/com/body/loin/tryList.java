package com.body.loin;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;


public class tryList {

    public static void main (String[] args){

        userInFo use1 = new userInFo("fds" ,"dsad");
        userInFo use2 = new userInFo("fds2" ,"dsad");
        List list = new ArrayList();
        list.add(use1);
        list.add(use2);
        System.out.print(list.get(0));
        System.out.print(list.get(1));
        Map<String,userInFo>  map = new HashMap<>();
        map.put("003",use1);
        map.put("004",use2);

        System.out.print(map.get("001") + "\n" + map.get("002"));
    }

}


