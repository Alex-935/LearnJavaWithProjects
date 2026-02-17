package _10;

import java.util.ArrayList;

interface DinosaurInt {

    void feed();
    void move();
}

class Dinosaur implements DinosaurInt, Comparable<Dinosaur> {

    private int age;
    ArrayList<Dinosaur> dinoList = new ArrayList<>();

    //Dinosaur(int age) {
    //    this.age = age;
    //}

    @Override
    public void feed() {
        System.out.println("Has been fed");
    }

    @Override
    public void move() {
        System.out.println("Moves");
    }

    @Override
    public int compareTo(Dinosaur dinoB) {
        return this.age - dinoB.age;
    }

}

interface Carnivore {

}
interface Herbivore {

}
class TRex implements Carnivore {

}
class Brachiosaurus implements Herbivore{

}

abstract class xVehicle{

    abstract void travel();
}

class Jeep extends xVehicle {

    @Override
    void travel() {
        System.out.println("Jeep goes brrr");
    }
}

class Helicopter extends xVehicle {

    @Override
    void travel() {
        System.out.println("Helicopter goes brrr");
    }
}

interface Worker {

}

class xEmployee implements Worker {

}

public class interfaces {
    
    public static void main(String[] args) {
        
    }
}
