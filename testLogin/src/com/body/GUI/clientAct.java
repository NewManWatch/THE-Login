package com.body.GUI;

import javax.swing.*;
import java.awt.*;

public interface clientAct {
    void  action(final clientAct user);//user需要操作的实例
    void watch(boolean now);// 实例是否可见  now   f/不可见   t/可见
    public JFrame getFrame();// 方便外部调用JFRAME的方法
    public JButton getBoolean(String ButtonID );//外部写按钮的监听，测试后不行


}
