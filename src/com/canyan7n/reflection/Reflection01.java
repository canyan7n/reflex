package com.canyan7n.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/27 21:33
 */
public class Reflection01 {

        /**
         * @author: macheng
         * @description: TODO
         * @date: 2023/2/27 21:39
         * @param args
         * @return void
         */
    public static void main(String[] args) throws Exception{
        Class aclass = Class.forName("com.canyan7n.Cat");
        Object o = aclass.newInstance();
        Method method = aclass.getMethod("hi");
        System.out.println(aclass.getConstructor());
//        System.out.println(aclass.getClassLoader());
        Field cname = aclass.getField("cColor");
        System.out.println(cname.get(o));
        method.invoke(o);

        System.out.println(aclass.getClass());
        System.out.println(aclass.getPackage());

        System.out.println(aclass.getName());
        System.out.println(aclass.newInstance());
        System.out.println();
        System.out.println(aclass.getField("cColor"));

        Field[] fields = aclass.getFields();
        for (Field f: fields
             ) {
        System.out.println(f.getName());
        }
    }
}
