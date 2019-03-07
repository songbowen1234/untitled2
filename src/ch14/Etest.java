package ch14;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Etest {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap <String,Integer> c1 = new ConcurrentHashMap<>() ;
        ExecutorService execotor2 = Executors.newFixedThreadPool(10);
        //ScheduledExecutorService execotor2 = Executors.newScheduledThreadPool(10); 预定线程池

        Runnable r1 = ()->{
            c1.merge("tom",1,Integer::sum) ;
                     //execotor2.schedule(r1,3,TimeUnit.SECONDS); 延迟三秒执行
                    //execotor2.shutdown();


        };
        for(int i = 0;i<10000;i++){
            execotor2.execute(r1);
        }
        Thread.sleep(3000);
        execotor2.shutdown();
        System.out.println(c1.get("tom"));


    }
}
