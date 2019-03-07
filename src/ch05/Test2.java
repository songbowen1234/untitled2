package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {
        //数组长度固定，不便插入
        //动态数组
        List list = new ArrayList(); //这种方法不好
        list.add(1);
        list.add("string");
        list.forEach(System.out::println);


        List<Integer> list1 = new ArrayList<>(); //这个好
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.forEach(System.out::println);
        //list1.remove(0); //删除第0个位置数，后面的自动补上
       // list1.forEach(System.out::println);
        list1.forEach(e -> System.out.printf("%-5d",e));//在同一行显示 固定格式

        System.out.println("\n"+ list1.get(2)); //将第二位分行显示

        list1.sort(Integer::compareTo); //按大小顺序排序
        Optional<Integer> max =  //求最大值
                list1.stream().max(Integer::compareTo );
        System.out.println(max.get());//打印求出的值



    }
}
