package ch14;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class F implements Callable <Integer>{
    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return 0;
    }
}

public class Ftest {
    public static void main(String[] args) {
        FutureTask <Integer> task = new FutureTask<>(new F());
        new Thread(task).start() ;


        try {
            System.out.println(task.isDone());
            System.out.println(task.get() );
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
