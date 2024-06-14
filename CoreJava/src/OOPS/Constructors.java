package OOPS;

public class Constructors {
    double laptop_price;
    String laptop_model;
    int screen_size;

    Constructors(double laptop_price, String laptop_model, int screen_size){    //constructors with three parameters
        this.laptop_price = laptop_price;
        this.laptop_model = laptop_model;
        this.screen_size = screen_size;
    }

    Constructors(double laptop_price, String laptop_model){      //constructor with two parameters
        this.laptop_price = laptop_price;
        this.laptop_model = laptop_model;
    }

    //methods
    void laptop_config(){
        System.out.println("Laptop price " + laptop_price);
        System.out.println("Laptop model " + laptop_model);
        System.out.println("Laptop screen size " + screen_size);
    }

    public static void main(String[] args) {
        Constructors cs = new Constructors(50000.00,"HP",15);
        cs.laptop_config();
        Constructors csf = new Constructors(50000.00,"DELL");
        csf.laptop_config();
    }
}
