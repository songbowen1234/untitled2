package ch06;

import java.util.Arrays;
import java.util.Comparator;



    public class Test5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Java是oop，但是很多时候我们需要给方法传递一些语句，然后这个传递对象
        //以往的做法是将这些语句封装在一个对象的方法中，然后传递这个对象
        //但是Java8之后将这些语句放在一个叫Lambda的类型中
        //Lambda也可以看作一种类型，所以也可以用来作为参数传递给方法
        //这样即解决来传递语句的问题，也不用破坏 java面向对象的特征
        User1 [] users = {};

        Comparator<User1>userSort = (o1,o2)->{
            if (o1.getId()>o2.getId()) return 1;
            else if(o1.getId()==o2.getId()) return 0;
            else return -1;
        };

        //Lambda语法()->{}
        //Lambda本质上就是一个方法，()是方法参数，{}内是方法体
        //由于Lambda本质上方法，而方法的参数类型已经确定，所以()内不需声明类型
        //Runnable r = ()->{};
       // Supploier s = ()->0;
        //Consumer c =(o)->{};
        //这是Lambda的三种表达方式
        Arrays.sort(users,userSort);
    }
}
