package com.autumn.learn.java8.clazz;

import com.autumn.learn.java8.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetClassObject {

    private static final Logger logger = LoggerFactory.getLogger(GetClassObject.class);

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 获取class对象的三种方法

        // 1、类名.class
        Class<User> userClass1 = User.class;
        logger.info(userClass1.getName());


        // 2、类实例变量.getClass()
        User user = new User();
        Class<User> userClass2 = (Class<User>) user.getClass();
        logger.info(userClass2.getCanonicalName());


        // 3、Class.forName("类全限定名")
        Class<User> userClass3 = (Class<User>) Class.forName("com.autumn.learn.java8.entity.User");
        logger.info(userClass3.getSimpleName());


        System.out.println("***********************");

        User user1 = userClass1.newInstance();
        System.out.println(user1.getName());
        Method method = userClass1.getDeclaredMethod("setName", String.class);
        method.invoke(method.invoke(user1, "tom"));
        System.out.println(user1.getName());

        System.out.println("***********************");

        Constructor<User> constructor = userClass2.getConstructor(String.class, int.class);
        User user2 = constructor.newInstance("zhangsan", 20);
        System.out.println(user2.getName());
        System.out.println(user2.getAge());

    }
}
