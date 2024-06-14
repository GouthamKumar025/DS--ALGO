package OOPS;

import java.util.ArrayList;

public class House {

    int id;
    String name;
    double price;

    House(int house_id, String house_name, double house_price){
        this.id = house_id;
        this.name = house_name;
        this.price = house_price;
    }

    public String toString(){
        return "House_ID: " + id + " House_name: " + name + " Price: " + price;
    }

    public static void main(String[] args) {
        House h1 = new House(27,"Roy",256.63);
        House h2 = new House(42,"James",842.32);
        House h3 = new House(74,"Stokes",942.12);

        ArrayList<House>houseArrayList = new ArrayList<>();
        houseArrayList.add(h1);
        houseArrayList.add(h2);
        houseArrayList.add(h3);

        for(House house : houseArrayList){
            System.out.println(house);
        }
    }
}
