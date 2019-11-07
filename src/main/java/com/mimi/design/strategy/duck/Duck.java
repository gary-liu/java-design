package com.mimi.design.strategy.duck;

import com.mimi.design.strategy.flybehivor.FlyBehivor;
import com.mimi.design.strategy.quackbehivor.QuackBehivor;

public abstract class Duck {

    FlyBehivor flyBehivor;
    QuackBehivor quackBehivor;

    public Duck() {
    }

    public void fly() {
        flyBehivor.fly();

    }

    public void quack() {
        quackBehivor.quack();

    }

    public void swim() {
        System.out.println("swim");

    }

    public abstract void display();


    public Duck(FlyBehivor flyBehivor, QuackBehivor quackBehivor) {
        this.flyBehivor = flyBehivor;
        this.quackBehivor = quackBehivor;
    }

    public FlyBehivor getFlyBehivor() {
        return flyBehivor;
    }

    public void setFlyBehivor(FlyBehivor flyBehivor) {
        this.flyBehivor = flyBehivor;
    }

    public QuackBehivor getQuackBehivor() {
        return quackBehivor;
    }

    public void setQuackBehivor(QuackBehivor quackBehivor) {
        this.quackBehivor = quackBehivor;
    }
}
