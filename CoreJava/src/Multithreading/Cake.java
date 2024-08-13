package Multithreading;

public class Cake implements Runnable{

    @Override
    public void run() {
        System.out.println("Preparing the ingredients " + Thread.currentThread().getName());
        System.out.println("Mixing the ingredients " + Thread.currentThread().getName());
        System.out.println("Final baking of the cake " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            Cake c = new Cake();
            Thread thread = new Thread(c);
            thread.start();
        }
    }
}
