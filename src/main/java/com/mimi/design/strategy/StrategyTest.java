package com.mimi.design.strategy;

import com.mimi.design.strategy.duck.Duck;
import com.mimi.design.strategy.duck.GreenHeadDuck;
import com.mimi.design.strategy.duck.RedHeadDuck;
import com.mimi.design.strategy.flybehivor.NoFlyBehivor;
import com.mimi.design.strategy.quackbehivor.NoQuackBehivor;

public class StrategyTest {
    public static void main(String[] args) {

        Duck greenHeadDuck = new GreenHeadDuck();
        Duck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.display();
        greenHeadDuck.fly();
        greenHeadDuck.quack();
        greenHeadDuck.swim();


        System.out.println("+++++++++++++++++++++");
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.display();

        System.out.println("=====================");
        redHeadDuck.setFlyBehivor(new NoFlyBehivor());
        redHeadDuck.fly();
        redHeadDuck.setQuackBehivor(new NoQuackBehivor());
        redHeadDuck.quack();
    }
}
