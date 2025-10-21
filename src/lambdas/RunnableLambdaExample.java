package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        //prior java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable");
            }
        };

        new Thread(runnable).start();

        //java 8

        Runnable runnable1 = () -> {
            System.out.println("inside runnable");
        };

        new Thread(runnable1).start();
    }
}
