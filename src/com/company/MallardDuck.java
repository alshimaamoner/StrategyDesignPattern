package com.company;

public class MallardDuck extends Duck
{
    public MallardDuck(){
         flyBehavior=new FlyNoWay();
         quackBehavior=new Quack();
    }
    @Override
    public void display() {

    }
}
