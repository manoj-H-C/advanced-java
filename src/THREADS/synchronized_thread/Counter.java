package THREADS.synchronized_thread;

public class Counter {

    private int count =0;

    public synchronized void  increment(){
//        synchronized (this){
//            count++;
//        }         // for individual block of code instead of whole method
        count++;
    }

    public int getCount(){
        return count;
    }
}
