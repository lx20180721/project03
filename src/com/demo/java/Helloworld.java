package com.demo.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * @author lixu
 * @date 2018年07月20日 16:32
 */
public class Helloworld {

    public static void main(String args[]) {
        //region 业务定义
        System.out.println("hello world !!");
        System.out.println("hello world !!");
        System.out.println("hello world !!");
        System.out.println("hello world !!");
        //endregion
        getlist();
    }

    private static void getlist() {
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList lis3t = new ArrayList();
    }

    public void method1() {

        try {
            FileInputStream fileInputStream = new FileInputStream("d:\\sss.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("hehe");
        }
    }
}
