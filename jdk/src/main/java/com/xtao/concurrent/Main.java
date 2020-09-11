package com.xtao.concurrent;

/**
 * @author diyi
 * @since 2020/9/11 3:33 下午
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
            System.out.printf(stackTraceElement.toString());
        }
    }
}
