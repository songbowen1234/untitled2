package ch06;

import java.io.Serializable;

//接口是用来被继承或实现的
//接口和接口之间可以进行继承，如interface Usb rxtends Bus
//接口和类之间可以进行实现，如class Computer implements Usb
//接口可以继承多个接口，注意类只能继承一个基类
//一个类可以实现多个接口
public interface Usb extends Bus, Serializable  {
//Serializable是系统自带的一个接口
}
interface Bus{
    public abstract void foo();
    //接口中的方法修饰符都是public abstract，即便不写也是

    public static final int i = 1;
    //接口中的属性都是public static final 不写也是

    //下面两个语法在Java 8 中新添加的
    public static void goo(){
        System.out.println("goo..........");
        //static 方法可以有实现
        //static方法和类中的static方法一样，用接口名或类名调用即可
        }
    public default void hoo() {
        System.out.println("hoo........");
        //default方法可以有实现
        //default方法用实现了接口的对象进行调用
        //该方法可以被覆盖
    }

}

class Computer implements Usb,Bus{
    @Override public void foo(){

    }

}
class Test10{
    public static void main(String[] args) {
        //接口不能产生对象 Bus b = new Bus();
        //接口和抽象类犹豫不觉时，优先用接口
        //接口是一个规范或者功能上的实现
        //抽象类侧重父子关系，在公有功能上进行抽象
        //接口中不能有普通方法，也不能有变量

        Bus.goo();
        Computer computer = new Computer();
        computer.hoo();
    }
}
