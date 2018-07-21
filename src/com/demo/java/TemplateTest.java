package com.demo.java;

import com.demo.bean.Custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lixu
 * @date 2018年07月20日 20:08
 */
public class TemplateTest {

    //模板六：prsf:生成 private static final
    private static final Custom custom=new Custom();
    //变形：psf
    public static final int NUM=1;
    //变形：psfi
    public static final int NUM1=1;
    //变形：psfs
    public static final String nice="wdw";

    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        //变形：soutp,soutv,xxx.sout
        System.out.println("hello");
        System.out.println("args = [" + args + "]");//soutp
        System.out.println("TemplateTest.main");
        int i = 10;
        System.out.println("i = " + i);//soutv
        int j = 20;
        System.out.println("j = " + j);//soutv
        System.out.println(j);//xxx.sout

        //模板三：fori
        String[] str = new String[]{"aaa", "bbbb", "ccc", "ddd", "eee"};
        for (int k = 0; k < str.length; k++) {
            System.out.println("str = " + str[k]);
        }
        //变形：iter
        for (String s : str) {
            System.out.println("s = " + s);
        }
        //变形：itar
        for (int k = 0; k < str.length; k++) {
            String s = str[k];
            System.out.println("s = " + s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (Object o : list) {
            System.out.println("o = " + o);
        }

        Map<String, Object> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }
       //变形：list.fori 正序遍历
        for (int i1 = 0; i1 < list.size(); i1++) {

        }
        //变形：list.forr 倒序遍历
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
            
        }
    }

    public void method() {
        System.out.println("TemplateTest.method");
        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        list.add(456);

        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {
            
        }
        //变形：xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
