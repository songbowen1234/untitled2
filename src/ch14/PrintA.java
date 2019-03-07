package ch14;

public class PrintA implements Runnable {
    @Override
    public void run() {

            try {
                for(int i = 0; i < 5;i++) {
                Thread.sleep(1000);//让A睡眠1秒输出（延时）用sleep需要抛异常让try包上循环和打印语句，不然只打一个A
                    System.out.printf("%-3s","A");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

