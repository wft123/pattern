package com.hanains.gof.builder;

public class Test {
    public static void main(String[] args) {
        Builder builder = new BatmanBuilder();
        Director director = new Director(builder);
        director.build();
        Hero hero = director.getHero();
        hero.showResult();
    }
}
