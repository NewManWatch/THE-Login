package com.body.util.data.user;

import com.body.loin.userInFo;

import javax.xml.xpath.XPath;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class DateBuildimpl implements DateBuild {
    @Override
    public userInFo builenewuser(userInFo newuser) {
        try{

            String writerfilename = newuser.getusername();
            String towriter = newuser.getusername()+"\n"+newuser.getuserpassword()+"\n";
// 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw
            /* 写入Txt文件 */
            String path = "./use/" ;
            File writename = new File(path);// 相对路径，如果没有则要建立一个新的output。txt文件
            if(!writename.exists()){
                writename.mkdirs();
            }
            writename = new File(path + writerfilename+".txt");// 相对路径，如果没有则要建立一个新的output。txt文件
            writename.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
            out.write(towriter); // \r\n即为换行
            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
