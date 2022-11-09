package com.autumn.learn.java8.DesignPatterns.factory.abstractfactory2;

import com.autumn.learn.java8.DesignPatterns.factory.Phone;

public interface AbstractFactory {
    public Phone productPhone();

    public Computer productComputer();
}
