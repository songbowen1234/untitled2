package ch07;

import java.io.IOException;

class MyException extends Throwable { //自己写一个异常 方便分类列如
    public MyException(){ //自己写的异常必须继承一个异常的父类 Throwable是所有异常的父类
        super("余额不足"); //下面抛出异常
    }

}

public class Test {
    void f(){
        throw new NullPointerException();
        //RuntimeException及其子类没有必要被声明或捕获(运行异常可以不声明但运行时候一定会出错）
    }
    public static void main(String[] args)
            throws NullPointerException,IOException,IndexOutOfBoundsException,Exception,MyException  {
        try{ //try中一旦发现异常就会立即停止try之后的语句，转而执行catch语句
            if(args.length>0)
                throw new MyException() ;
            System.out.println("hello");
            //return ; //后面finally还是会执行（return执行前finally就执行了）如果finally中也有return，这个返回值会覆盖原始返回值
            System.exit(1);//当出现这种情况不会执行finally括号里的数随意写(执行这个要把return消了）
        }catch(MyException e){ //catch参数捕获的异常类型必须是抛出异常本身或者是其父类
            e.printStackTrace(); //这个句子打印错误信息不写也可以
        }catch(Throwable e){
            //catch可以有多个，但是最下面的应该是类型最宽泛的
            System.out.println("catch...");//多个catch只有一个执行（优先选符合条件的执行）
        }finally{
            //无论是否产生异常，finally里面的内容必须执行
            System.out.println("finally");
        }


        //int i = 1 / 0; //throws 声明一种异常(异常有很多种) 虽然机器没爆红但1/0会运行运行异常
        //throw new MyException(); //抛出异常 （一旦有抛出就会有声明）这（）里不写就掉上面的余额不足，写就爆这里的错误
        //一旦程序发生异常就不再继续执行类如下会报错
       // System.out.println();
    }
}
