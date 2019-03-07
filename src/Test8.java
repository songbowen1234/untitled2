public class Test8 {
    //java中的参数用来给方法传递值
    //例如；int foo(int i,double d){
    //参数格式 类型  变量名
    //多个参数用逗号分开，这些参数叫形式参数（行参）
    //形式参数可以被认为是在方法中的变量
    //System.out.println("foo:" +i +d);
    //return 1;
    //方法中带参数的话，在调用时必须给参数实际值
    int foo(){ //这个叫方法 可以调用
        System.out.println("foo");
        System.out.println("foo");
        System.out.println("foo");
        return 1; //又带返回值的方法必须写return
    }

    public static void main(String[] args) {
        Test8 t = new Test8(); //新生成一个变量t用它调用方法
        int i = t.foo(); //调用一次就打印一次
        t.foo(); //有返回值
        System.out.println(t.foo()); //没有这句话就是又返回值但不打印
    }
}
