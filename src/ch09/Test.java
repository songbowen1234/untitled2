package ch09;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");

        System.out.println(list.get(0));

        Iterator<String> it = list.iterator() ;//取到一个集合的迭代品，迭代器用于遍历（循环）集合
        while(it.hasNext()) //尝试跨过一个元素，能跨过去则是true否则false
            System.out.println(it.next()); //将被跨过的元素取出，返回

        for(String s : list)
            System.out.println(s); //foreach循环遍历集合，其实后台实际上是迭代器完成的

        list.forEach(System.out::println); //lambda表达式遍历集合

        //Array是数组的反射类
        //Arrays是操纵数组的一些工具（方法）集合
        //Collection是所有接口的父接口
        //Collections是操纵集合的一些工具（方法）集合
    }
}
