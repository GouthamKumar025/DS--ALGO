package OOPS;

abstract class Animal{
    abstract void animalname();

    void animalsound(){
        System.out.println("Animal is roaring");
    }
}

class Pig extends Animal{
    public void animalname(){
        System.out.println("Pig is here");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Pig p = new Pig();
        p.animalname();
        p.animalsound();
    }
}
