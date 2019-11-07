package com.mimi.design.strategy.flybehivor;

public class NoFlyBehivor implements FlyBehivor {
    @Override
    public void fly() {
        System.out.println("no fly");

    }
}
