package com.body.log;

public class logCacheFormat{

    static public String time ;
    static public String user ;
    static public String active ;

    public static String getTime() {
        return time;
    }

    public static void setTime(String time) {
        logCacheFormat.time = time;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        logCacheFormat.user = user;
    }

    public static String getActive() {
        return active;
    }

    public static void setActive(String active) {
        logCacheFormat.active = active;
    }
}