package exam02;

import exam01.Apple;

import java.util.ArrayList;

public class Jucier {
    // ? - Fruit, Apple, Grape
    public static void make(FruitBox<? extends Fruit> box) {
        ArrayList<?> fruits =  box.getItems();
        System.out.println(fruits);
    }

    public static <T extends Fruit> void make3 () {

    }

    // ? - Apple, Fruit, Object
    public static void make2(FruitBox<? super Apple> box) {
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }
}