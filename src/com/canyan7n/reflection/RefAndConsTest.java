package com.canyan7n.reflection;

import com.canyan7n.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/27 21:45
 * 反射的优点是动态创建对象，但是时间消耗大
 */
public class RefAndConsTest {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
        m3();
    }

    //反射创建实例
    public static void m1() throws Exception{
        long start = System.currentTimeMillis();
        Class aClass = Class.forName("com.canyan7n.Cat");
        for(int j = 0; j < 9900000; j++) {
            Object o = aClass.newInstance();
            Method method = aClass.getMethod("hi");
//            method.setAccessible(true);
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m1()创建实例的时间：" + (end - start));
    }

    //构造器创建实例
    public static void m2(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9900000; i++) {
            Cat cat = new Cat();
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m2()创建实例的时间：" + (end - start));
    }

    public static void m3() throws InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException {
        long start = System.currentTimeMillis();
        Class aClass = Class.forName("com.canyan7n.Cat");
        for(int j = 0; j < 9900000; j++) {
            Object o = aClass.newInstance();
            Method method = aClass.getMethod("hi");
            method.setAccessible(true);
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m3()创建实例的时间：" + (end - start));
    }
}
