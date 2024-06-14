package OOPS;


interface Car{
    void Carsound();
}

class BMW implements Car{
    public void Carsound(){
        System.out.println("BMW is here");
    }
}

class Ford implements Car{
    public void Carsound(){
        System.out.println("Ford is here");
    }
    public void Carsong(){
        System.out.println("Weekend");
    }
}

public class multiple_inherit {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.Carsound();
        Ford f = new Ford();
        f.Carsound();
        f.Carsong();
    }

}
