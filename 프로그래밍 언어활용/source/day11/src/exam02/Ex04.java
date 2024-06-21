package exam02;

import exam01.Apple;
import exam01.Fruit;

public class Ex04 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());

        Jucier.make2(appleBox); // Apple,

        FruitBox<Grape> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape());
        //Jucier.make2(grapeBox);
    }
}