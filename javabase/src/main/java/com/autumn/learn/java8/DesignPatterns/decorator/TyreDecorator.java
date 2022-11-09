package com.autumn.learn.java8.DesignPatterns.decorator;

public class TyreDecorator implements ITyre {
    private ITyre iTyre;

    public TyreDecorator(ITyre iTyre) {
        this.iTyre = iTyre;
    }

    @Override
    public void listFunction() {
        iTyre.listFunction();
    }
}
