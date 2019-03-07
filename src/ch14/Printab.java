package ch14;


public class Printab { //这是不简化的写法
    public static void main(String[] args) {
        Thread a = new Thread(new PrintA());
        //new Thread(new PrintA()).start(); 可以代替new个对象
        Thread b = new Thread(new PrintB());
        Thread c = new Thread(new PrintC());
        Thread d = new Thread(new PrintD());

        //a.start() ;
        //b.start() ;
        //c.start() ;
        d.start() ;

    }
}
