import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        A a1 = new A(); //a1这个变量引用了类A的对象
        //创建对象语法：类 变量名 = new 类（）；
        A a2 = new A();
        A a3 = new A();
        Date birthday = new Date(); //下面的new Date()可用birthday 替换
        System.out.println(new Date());
        int i = 1;
        System.out.println(i);
        Date deadLine = null; //date 的对象可以先不引用 就是空
        deadLine = birthday;  //把birthday 的对象给deadline
    }
}
    class A{}
    //我们可以把类看作我们自己发明的一种类型
    //比如int i
    //我们可以有 A a


