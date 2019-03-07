package ch08;

import java.util.ArrayList;

import static ch08.Test1.f;
import static ch08.Test1.min;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//范型
        list.add(123);//加
        list.add(456);
        list.add(789);

        int i = list.get(1);//取

        Test1<Integer,Double> test1 = new Test1<>() ;
        Test1<String ,String> test2 = new Test1<>() ;

        Test1.<String>f();

        int b = Test1.<Integer>getMiddle(1,2,4,5,6);  //<...>范型里是什么类型后面括号写什么，也可以是字符串如
        String   b1 = Test1.<String>getMiddle("av","ab","ac");

        Test1.<String>min(new String[]{"aa","bb"});



        System.out.println(i);
        System.out.println(test1);
        System.out.println(Test1.<String>f());
        System.out.println(b);
        System.out.println(b1);
        
    }
}
