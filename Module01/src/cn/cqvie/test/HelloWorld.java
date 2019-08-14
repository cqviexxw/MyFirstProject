package cn.cqvie.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {
    private String name;
    private int age;

    public static final int SIZE=10;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HelloWorld() {
    }

    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        System.out.println("HelloWorld....Module01");
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        Date date = new Date();
        for (String s : list) {
            System.out.println(s);
        }
        show();
    }

    public static void show() {
        System.out.println("你好");
        System.out.println("大家好");

    }
}
