public interface I {
    public static final int i = 1;

    private static int fun(){
        return 0;
    }

    public abstract void f(); //没有方法体的默认是抽象的共有的
     public static void g(){  //有方法体的都是静态的公有的或者default的
         fun(); //错是因为静态的只可以调用静态域和静态方法 在private后加static即可
     }
     public default void h(){
         fun();  //这个默认的就没问题
     }
}
