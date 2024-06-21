package exam03;

import exam02.A;

import java.util.jar.Manifest;

public class Ex01 {
    public static void main(String[] args) {
        Animal human = new Human(); // Human, Animal
       // human.move();

        Animal tiger = new Tiger(); // Tiger, Animal
        //tiger.move();

        Animal bird = new Bird();// Bird, Animal
       // bird.move();

        Animal[] animals = new Animal[3];
        animals[0] = human; // Animal animals[0] = human;
        animals[1] = tiger; // Animal animals[1] = tiger;
        animals[2] = bird; // Animal animals[2] = bird;

        //for (int i = 0; i < animals.length; i++) {
          //  animals[i].move();
        //}
        for (Animal animal : animals ) {
            animal.move();
        }
    }
}
