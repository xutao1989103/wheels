package com.xtao.jvm;

public class Clazz {

    private String name;

    public Clazz(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Clazz c = new Clazz("tao");
        String upperName = c.toUpper(c.name);

        Data data = new Data(1);

        System.out.println(data);
        System.out.printf(upperName);
    }

    public String toUpper(String input) {
        return input.toUpperCase();
    }
}
