public class Tset7 {
    public static void main(String[] args) {
        Empioyee1 tom = new Empioyee1("tom",1000);
        tom.pi = 100;  //通常用类名Empioyee调用而不用tom jerry 是共享的内容不属于tom也不属于jerry
        System.out.println(tom.pi); // pi前的都可以用Empioyee替换
        tom.setName("jerry") ;
        System.out.println(tom.getName());
        Empioyee1 jerry = new Empioyee1("tom",2000);
        System.out.println(jerry.pi);
        jerry.pi = 200; //公有的不管谁把它改变了再打印都是新改变的 谁打印都是新的如下面命令

        System.out.println(tom.pi);
    }
}
