package OOPS;

public class Polymorphism {

    public void animal_sound(){
        System.out.println("Dog is barking");
    }


    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        Polymorphism p_cat =new cat();
        Polymorphism p_lion = new lion();
        p.animal_sound();
        p_cat.animal_sound();
        p_lion.animal_sound();


    }
}

class cat extends Polymorphism{
    public void animal_sound(){
        System.out.println("Cat is meowing");
    }
}

class lion extends Polymorphism{
    public void animal_sound(){
        System.out.println("Lion is roaring");
    }
}

