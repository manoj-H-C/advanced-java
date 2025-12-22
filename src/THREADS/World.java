package THREADS;

public class World extends Thread{
    //when class extends thread class
    @Override
    public void run() {
        for(;;){
            System.out.println("world");
        }
    }
}
