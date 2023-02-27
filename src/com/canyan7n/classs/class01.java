package com.canyan7n.classs;

import com.canyan7n.Cat;

import java.util.Map;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/27 23:00
 * 获取Class类对象的6中反射
 */
public class class01 {

        /**
         * @author: macheng
         * @description: TODO
         * @date: 2023/2/27 23:01
         * @param args
         * @return void
         */
    public static void main(String[] args) throws ClassNotFoundException {
//        方式1
        Class cls1 = Class.forName("com.canyan7n.Cat");
        System.out.println(cls1);

//        方式2
        Class<Cat> cls2 = Cat.class;
        System.out.println(cls2);
//        方式3
        Cat cat = new Cat();
        Class cls3 = cat.getClass();
        System.out.println(cls3);

//        方式4
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class cls4 = classLoader.loadClass("com.canyan7n.Cat");
        System.out.println(cls4);

//        方式5
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);

//        方式6
        Class<Integer> integerClass1 = Integer.TYPE;
        System.out.println(integerClass1);

        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());
        System.out.println(integerClass.hashCode());
        System.out.println(integerClass1.hashCode());

    }
}
