package ch14;

public class PrintTest { //多线程代码 这是简化后的样子
    public static void main(String[] args) {
            new Thread(()->{
                for(int i = 0;i < 10;i++)
                    System.out.printf("%-3d",0);
            }).start();

            new Thread(()->{
                for(int i = 0;i < 10;i++)
                    System.out.printf("%-3d",1);
            }).start();
        }
    }

