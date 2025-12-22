package THREADS;

public class MyThreadMethods extends Thread{
//    @Override
//    public void run() {
//        System.out.println("Thread is running......");
//        for (int i=0;i<5;i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
//        }


    public MyThreadMethods(String name) {
        super(name);
    }
//    @Override
//    public void run() {
//        for (int i=0; i<5; i++){
//            String a ="";
//            for (int j = 0; j < 10000; j++) {
//                a+="a";
//            }
//            System.out.println(Thread.currentThread().getName()
//                    + " - Priority: " + Thread.currentThread().getPriority()
//            + " - Count: " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("thread interrupted : " + e);
//            }
//        }


//    @Override
//    public void run() {
//        for (int i=0; i<5 ;i++ ){
//            System.out.println(Thread.currentThread().getName() + " is running!");
//            Thread.yield(); //both threads gets chance to run instead of finishing one first
//    }


    @Override
    public void run() {
        while (true){
            System.out.println("Hello World !");
    }
}

    public static void main(String[] args) throws InterruptedException {
//        MyThreadMethods t1= new MyThreadMethods();
//        t1.start();
//        t1.join(); //waits for thread to end
//        System.out.println("Hello");

//        MyThreadMethods l = new MyThreadMethods("low priority thread");
//        MyThreadMethods m = new MyThreadMethods(" medium priority thread");
//        MyThreadMethods h = new MyThreadMethods("high priority thread");
//
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        h.setPriority(Thread.MAX_PRIORITY);
//
//        l.start();
//        l.interrupt();//this stops the l thread from its task.
//        m.start();
//        h.start();

//        MyThreadMethods t1 = new MyThreadMethods("manoj");
//        MyThreadMethods t2 = new MyThreadMethods("hari");
//        t1.start();
//        t2.start();

        MyThreadMethods t1 = new MyThreadMethods("t1");
        t1.setDaemon(true);
        t1.start();
        System.out.println("main done");
    }
}
