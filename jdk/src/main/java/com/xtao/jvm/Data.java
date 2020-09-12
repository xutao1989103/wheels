package com.xtao.jvm;

import java.util.Arrays;

public class Data {

    private int num;
    private int[] data;


    public Data(int num) {
        this.num = num;
        data = new int[1024];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "num=" + num +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
