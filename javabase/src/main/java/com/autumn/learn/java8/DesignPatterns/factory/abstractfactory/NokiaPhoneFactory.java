package com.autumn.learn.java8.DesignPatterns.factory.abstractfactory;

import com.autumn.learn.java8.DesignPatterns.factory.NokiaPhone;
import com.autumn.learn.java8.DesignPatterns.factory.Phone;


public class NokiaPhoneFactory implements PhoneFactory{

    @Override
    public Phone productPhone() {
        return new NokiaPhone();
    }
}
