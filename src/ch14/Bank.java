package ch14;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private final double [] accounts;
    private Lock bankLock;
    //private Condition sufficientFunds;  条件


    public Bank(int n,double initialBalance){
        accounts = new double[n];
        Arrays.fill(accounts,initialBalance); //为数组赋值
         Lock bankLock = new ReentrantLock() ;  //创建一个锁
        //sufficientFunds = bankLock.newCondition(); 创建一个条件给锁
    }

    public void transfer(int from,int to,double amount) {
        bankLock.lock(); //加锁

        try {
            if(accounts[from] < amount)return;
            //while(accounts[from] < amount) sufficientFunds.await(); 条件锁执行这个
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[from] += amount;
            System.out.printf("Total Balance: %10.2f%n", getTotalBalance());
            //sufficientFunds.signaAll(); 条件锁加上这句
        } finally {
            bankLock.unlock();
        }
    }

    public double getTotalBalance(){
        double sum = 0;
        for(double a : accounts)
            sum += a;
        return sum;
    }
    public int size() {
        return accounts.length;
    }
}

