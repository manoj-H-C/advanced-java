package THREADS;

public class World1 implements Runnable{
    @Override
    public void run() {
        for(;;){
            System.out.println("world1");
        }
    }

}
