package OOPS;

public class animal {

    int id;
    String animal;


    void setId(int animal_id){
        this.id = animal_id;
    }

    void setAnimal(String animal_name){
        this.animal = animal_name;
    }

    void dog(){
        System.out.println("Animal id " + id);
        System.out.println("Animal name "+ animal);
    }

}

class animal2 extends animal{
    void displayDetails() {
        dog(); // calling the display method from the Animal class
    }

    public static void main(String[] args) {
        animal2 ani = new animal2();
        ani.setId(1);
        ani.setAnimal("Dog");
        ani.displayDetails();
    }





}
