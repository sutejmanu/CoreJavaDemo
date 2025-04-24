import java.lang.invoke.MutableCallSite;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 10 ; i++){
            ex.submit(new MyClass());
        }
    }
}

class MyClass implements Runnable{
    @Override
    public void run() {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread Name---:" + Thread.currentThread().getName());
            System.out.println();

    }
}