package ch14;

public class PrintC implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5;i++) {
            Thread.yield(); //通知CPU该线程可以让出CPU给其他线程执行
            System.out.printf("%-3d", 2);
        }

    }
}
