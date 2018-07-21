package com.demo.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lixu
 * @date 2018年07月20日 20:08
 */
public class TemplateTest1 {

    //修改操作
    public static final int num1 = 20;

    /**
     * 客户的id
     */
    private int customId;
    /**
     * 客户名称
     */
    private String cname;

    public static void main(String[] args) {
        testAdd();
    }

    /**
     * 生成模板的演示
     */
    public static void testAdd() {

        Map<String, Object> map = new HashMap<>();
        map.put("aa", 1);
        map.put("bb", 2);
        map.put("cc", 3);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("entry.getValue() = " + entry.getValue());
            System.out.println("entry.getKey() = " + entry.getKey());
        }
    }
}
