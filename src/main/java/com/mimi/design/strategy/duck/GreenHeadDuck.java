package com.mimi.design.strategy.duck;

import com.mimi.design.strategy.flybehivor.GoodFlyBehivor;
import com.mimi.design.strategy.quackbehivor.GagaQuackBehivor;

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehivor = new GoodFlyBehivor();
        quackBehivor = new GagaQuackBehivor();
    }

    @Override
    public void display() {
        System.out.println("greenHead");

    }
}
