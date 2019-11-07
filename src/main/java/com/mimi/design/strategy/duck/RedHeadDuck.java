package com.mimi.design.strategy.duck;

import com.mimi.design.strategy.flybehivor.BadFlyBehivor;
import com.mimi.design.strategy.quackbehivor.GegeQuackBehivor;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehivor = new BadFlyBehivor();
        quackBehivor = new GegeQuackBehivor();
    }

    @Override
    public void display() {

        System.out.println("redHead");

    }
}
