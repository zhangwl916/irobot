package com.irobot.admin.controller;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InvokeByRuntime {

    /**
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
//        String exe = "python";
//        String command = "D:\\calculator_simple.py";
//        String num1 = "451";
//        String num2 = "256";
//        String[] cmdArr = new String[] {exe, command, num1, num2};
//        Process process = Runtime.getRuntime().exec(cmdArr);
//        InputStream is = process.getInputStream();
//        DataInputStream dis = new DataInputStream(is);
//        String str = dis.readLine();
//        process.waitFor();
//        System.out.println(str);


        String exe = "python";
        String command = "D:\\library_book.py";
        String path = "D:\\jieba_userdict.txt";
        String str = "请帮我找一本舒克和贝塔好吗";
        String[] cmdArr = new String[]{exe, command, path};
        Process process = Runtime.getRuntime().exec(cmdArr);
        InputStream is = process.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String aa = dis.readLine();
        process.waitFor();
        System.out.println(aa);
    }

}
