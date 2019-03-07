public class Static {
    public  int i = 1;
    public static int j = 2;

    public static void s1(){
        Static.j = 1; //静态只可以掉静态的
    }

    public void f1(){
        Static.j = 1;  //普通方法可以掉静态 非静态的都可以
        this.i = 1;
        Static.s1();
    }

}
