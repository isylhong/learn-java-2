package com.autumn.learn.java8.DesignPatterns.factory.multimethod;

import com.autumn.learn.java8.DesignPatterns.factory.HuaWeiPhone;
import com.autumn.learn.java8.DesignPatterns.factory.NokiaPhone;
import com.autumn.learn.java8.DesignPatterns.factory.Phone;
import com.autumn.learn.java8.DesignPatterns.factory.XiaoMiPhone;


public class MultiMethodFactory {

    public Phone productNokiaPhone() {
        return new NokiaPhone();
    }

    public Phone productXiaoMiPhone() {
        return new XiaoMiPhone();
    }

    public Phone productHuaWeiPhone() {
        return new HuaWeiPhone();
    }
}
