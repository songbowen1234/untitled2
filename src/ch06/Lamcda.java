package ch06;

public class Lamcda {
    public static void main(String[] args) {
        Lambda l = (num1,num2)->{
            System.out.println(num1+num2);
            return 0;
        };
        //Lambda表达式其实是一个方法
        //接受这个表达式的必须是一个仅包含了相应方法的接口不能再有别的方法
        //函数式接口：仅包含一个抽象方法的接口
        //所有的函数式接口都可以来存放Lambda表达式
    }
}
