package ch09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        Integer [] arr = {1,3,2,4,6,7,8};

        List<Integer> list = Arrays.asList(arr); //将数组转化为集合
        //list是一个假的集合，只是一个视图（只能看不能改）
        list.forEach(e-> System.out.printf("%-3d",e));
        //list.add(9); 抛出异常 要想改用下面的方法
        System.out.println();

        List<Integer> list1 = new ArrayList<>(list);
        list1.add(9);
        list1.forEach(e-> System.out.printf("%-3d",e));

        //--------------------------------------------
        System.out.println();
        Object [] arr1 = list1.toArray() ; //toArray将集合转换为数组
        Arrays.stream(arr1).forEach(e-> System.out.printf("%-3d",e));

        System.out.println();

        Integer [] arr2 = list1.toArray(new Integer[0]) ; //固定写法这样写可以写出你想要的数组
        Arrays.stream(arr2).forEach(e-> System.out.printf("%-3d",e));

        System.out.println();

        list1.subList(1,3).forEach(e-> System.out.printf("%-3d",e));
        //subList(m,n)取数组下表从第n个元素到第m-1个元素
        //生成了一个新集合，但是这个新的也是个假的集合，不可以改

        System.out.println();

        List<Integer> list2 = Collections.unmodifiableList(list1);
        //生成一个不能被修改的只能读的集合
        list2.forEach(e-> System.out.printf("%-3d",e));
    }
}
    //集合体系结构中有很多Abstract开头的抽象类（如AbstractSet）
    //这些抽象类一般不会直接使用
    //他们存在的意义是将接口（如Set）中不依赖于具体实现的方法事先写好
    //再让具体实现类（如HashSet,TreeSet）来进行继承
    //这样可以让代码变得更加模块化