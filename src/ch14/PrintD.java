package ch14;

public class PrintD implements Runnable {
    @Override
    public void run() {
        Thread threads = new Thread(()->{
            for (int i = 0; i < 5;i++){
                System.out.printf("%-3s", "Z");
            }

        });
        threads.start();
        for(int i = 0;i < 5;i++){
        if(i==3){
            try {
                threads.join();  //插入线程

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.printf("%-3s","D");

    }

    }
}
