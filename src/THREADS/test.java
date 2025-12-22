package THREADS;

public class test {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(Thread.currentThread().getName());
        //main method always runs in main thread

        //for extents Thread
        World world = new World();
        world.start();

        //for implements Runnable
        World1 world1 = new World1();
        Thread t1 = new Thread(world1);
        t1.start();
    }
}
