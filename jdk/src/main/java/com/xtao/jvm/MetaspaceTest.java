package com.xtao.jvm;

import com.google.common.collect.Lists;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.List;

public class MetaspaceTest {
    public static void main(String[] args) {
        func(1);
    }

    public static void func(int i) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
        func(i + 1);
    }

    public static void genObject() {
        List<Data> dataList = Lists.newArrayList();
        int i = 0;
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("running");
            dataList.add(new Data(i++));
        }
    }

    public static void generateMeta(final String[] args) {
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Enhancer enhancer = new Enhancer();

            enhancer.setSuperclass(MetaspaceTest.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(objects, args);
                }
            });
            System.out.println("running");
            enhancer.create();
        }
    }
}
