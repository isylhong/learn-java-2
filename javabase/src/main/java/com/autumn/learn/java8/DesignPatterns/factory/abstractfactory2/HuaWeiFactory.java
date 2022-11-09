package com.autumn.learn.java8.DesignPatterns.factory.abstractfactory2;

import com.autumn.learn.java8.DesignPatterns.factory.HuaWeiPhone;
import com.autumn.learn.java8.DesignPatterns.factory.Phone;

public class HuaWeiFactory implements AbstractFactory{
    @Override
    public Phone productPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Computer productComputer() {
        return new HuaWeiComputer();
    }
}
