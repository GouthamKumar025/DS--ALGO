package Multithreading;

public class SampleThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i + " ");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            SampleThread s = new SampleThread();
            Thread myThread = new Thread(s);
            myThread.start();
        }
    }
}
