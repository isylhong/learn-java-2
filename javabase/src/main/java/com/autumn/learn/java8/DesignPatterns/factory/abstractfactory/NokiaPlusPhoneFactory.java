package com.autumn.learn.java8.DesignPatterns.factory.abstractfactory;

import com.autumn.learn.java8.DesignPatterns.factory.Phone;

public class NokiaPlusPhoneFactory implements PhoneFactory{
    @Override
    public Phone productPhone() {
        return new NokiaPlusPhone();
    }
}
