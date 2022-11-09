package com.autumn.learn.java8.DesignPatterns.factory.multistaticmethod;

import com.autumn.learn.java8.DesignPatterns.factory.HuaWeiPhone;
import com.autumn.learn.java8.DesignPatterns.factory.NokiaPhone;
import com.autumn.learn.java8.DesignPatterns.factory.Phone;
import com.autumn.learn.java8.DesignPatterns.factory.XiaoMiPhone;


public class MultiStaticMethodFactory {

    public static Phone productNokiaPhone() {
        return new NokiaPhone();
    }

    public static Phone productXiaoMiPhone() {
        return new XiaoMiPhone();
    }

    public static Phone productHuaWeiPhone() {
        return new HuaWeiPhone();
    }
}
