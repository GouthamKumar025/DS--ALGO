package OOPS;


enum Sound_volume{
    LOW,
    MEDIUM,
    HIGH
}

public class Sound {
    public static void main(String[] args) {
        System.out.println("Our home has best speakers with " +  Sound_volume.HIGH);
        System.out.println("Our home has worst speakers with " +  Sound_volume.LOW);
        System.out.println("Our home has good speakers with " +  Sound_volume.MEDIUM);
    }
}
