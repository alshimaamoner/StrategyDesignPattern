package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        Duck modelDuck=new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }
}
