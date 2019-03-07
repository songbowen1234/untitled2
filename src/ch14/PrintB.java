package ch14;

public class PrintB implements Runnable  {
    @Override
    public void run() {
        for(int i = 0;i < 5;System.out.printf("%-3s","B"),i++); //不用A的写法也可以用买这个

    }
}
