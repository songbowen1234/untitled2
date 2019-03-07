package ch14;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

public class PrintE  {
    public static void main(String[] args) throws InterruptedException {
        //ConcurrentHashMap <String,Integer> c = new ConcurrentHashMap<>() ; 这个不好
        ConcurrentHashMap <String, LongAdder> c = new ConcurrentHashMap<>() ;
        //c.put("tom",0);
        c.put("tom",new LongAdder());

        ExecutorService execotor1 = Executors.newFixedThreadPool(10);
        Runnable r = ()->{
            //c.put("tom",c.get("tom")+1);
            c.putIfAbsent("tom",new LongAdder()).increment() ;
        };
        for(int i = 0;i<10000;i++){
            execotor1.execute(r);
        }
        Thread.sleep(3000);
        execotor1.shutdown();
        System.out.println(c.get("tom"));
    }
    //但是这个也不是最好，最好用Etest中的方法

}

