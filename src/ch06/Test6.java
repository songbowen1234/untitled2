package ch06;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        Integer [] nums = {1,3,9,5,7};
        //Arrays.sort(nums,Integer::compare); //方法引用 人家写好的我们直接拿来用
        //::方法引用：引用compare(x,y)->{return Integer.compare(x,y);})用Lambda表达式简化为上式
        //::后面方法有几个参数就要在Lambda表达式中写几个参数(x)->{System.out.println(x)}等价于System.out.printl

        //还可以这样写这就是套语法
        Arrays.sort(nums,(x,y)->{return Integer.compare(x,y);});
        System.out.println(Arrays.toString(nums));
    }
}
