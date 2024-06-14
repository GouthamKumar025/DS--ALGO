package OOPS;

public class laptop_class {

    //properties
    double laptop_price;
    String laptop_model;
    int screen_size;
    //methods
    void laptop_config(){
        System.out.println("Laptop price " + laptop_price);
        System.out.println("Laptop model " + laptop_model);
        System.out.println("Laptop screen size " + screen_size);
    }

    public static void main(String[] args) {
        // creating object for laptop class
        laptop_class lp = new laptop_class();
        lp.laptop_price = 50000.00;
        lp.laptop_model = "HP";
        lp.screen_size = 15;

        lp.laptop_config();
    }



}
