package com.woniuxy;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author: masterhai
 * @date: 2021/5/1:11:11
 * @description:java的参数传递测试
 */

public class TransactionTest extends A{
    private static String name = "我的名字";

    public static void main (String[] args) {
        System.out.println("1：" + name);
        ArrayList<String> list = new ArrayList<String>(10);
        list.add(name);
        getMyName(list);
        System.out.println("2:" + list.get(0));
        System.out.println("3:" + getMyName(list));
        A a=new TransactionTest();
        a.getList("sss");

    }

    public static String getMyName (ArrayList<String> list) {
        String name = "修改过后的" + list.get(0);
        System.out.println("修改过后的name:" + name);
        return name;
    }
   @Override
   ArrayList<String> getList (String str)  {
       System.out.println("子类");
        return new ArrayList<String>();
    }

    @Override
    public void say () {

    }
}

abstract class A {
     ArrayList<String> getList (String str)  {
        System.out.println("父类");
        return new ArrayList<String>();

    }
    public abstract  void say();
}
