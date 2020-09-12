package com.xtao.concurrent;

import java.util.concurrent.BlockingDeque;

/**
 * @author diyi
 * @since 2020/9/11 5:37 下午
 */
public class TaskPool implements Executor {

    private int coreSize;
    private BlockingDeque<Runnable> taskQueue;

    public static TaskPool newInstance(int coreSize) {
        TaskPool instance = new TaskPool();

        return instance;
    }

    @Override
    public void execute(Runtime task) {

    }
}
