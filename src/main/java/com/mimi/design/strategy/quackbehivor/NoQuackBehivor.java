package com.mimi.design.strategy.quackbehivor;

public class NoQuackBehivor implements QuackBehivor {
    @Override
    public void quack() {
        System.out.println("no quack");

    }
}
