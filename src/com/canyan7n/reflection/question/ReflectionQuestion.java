package com.canyan7n.reflection.question;

import com.canyan7n.Cat;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/23 13:29
 * 反射问题
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        /**
         * 原来获取对象实例然后调用方法
            Cat cat = new Cat();
            cat.hi();
         *
         */

        //反射
        //拿到配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String fullclasspath = properties.get("fullclasspath").toString();
        String methodname = properties.get("methodname").toString();

        //类加载
        Class aClass = Class.forName(fullclasspath);
        //拿到对象的实例
        Object o = aClass.newInstance();
        //拿到方法所属类的类
        Method methodName = aClass.getMethod(methodname);
        //调用这个类的方法
        methodName.invoke(o);
    }
}
