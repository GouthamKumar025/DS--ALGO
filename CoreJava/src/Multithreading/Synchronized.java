package Multithreading;

class Counter{
    int count_cake = 0;
    public void increment(){
        count_cake ++;
    }
}

class Team implements Runnable{
    Counter count;
    Team(Counter count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            count.increment();
        }
    }
}
public class Synchronized {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread team1 = new Thread(new Team(counter));
        Thread team2 = new Thread(new Team(counter));

        team1.start();
        team2.start();

        try{
            team1.join();
            team2.join();
        }
        catch (Exception e){
            System.out.println("Exception occured");
        }
        System.out.println(counter.count_cake);
    }
}
