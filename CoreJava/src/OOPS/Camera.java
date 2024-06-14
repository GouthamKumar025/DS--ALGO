package OOPS;

public class Camera {
    private int id;
    private String brand;
    private String color;
    private double price;


//    Camera(int Camera_id, String brand, String color, double price ){
//        this.id = Camera_id;
//        this.brand = brand;
//        this.color = color;
//        this.price = price;
//    }

    public void  setId(int id){
        this.id = id;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }

    void display(){
        System.out.println("Camera_id: " + id + " brand " + brand +" color " + color + " price: " + price);
    }


    public static void main(String[] args) {
        Camera c = new Camera();
        c.setId(25);
        c.setBrand("Nikon");
        c.setColor("Red");
        c.setPrice(456.32);
        c.display();

        // Create and set details for the second Camera object
        Camera cam2 = new Camera();
        cam2.setId(26);
        cam2.setBrand("Canon");
        cam2.setColor("Black");
        cam2.setPrice(499.99);
        cam2.display();

        // Create and set details for the third Camera object
        Camera cam3 = new Camera();
        cam3.setId(27);
        cam3.setBrand("Sony");
        cam3.setColor("White");
        cam3.setPrice(579.99);
        cam3.display();

    }
}
