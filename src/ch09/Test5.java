package ch09;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap(); //映射<建，值>可自己写自己定
        //TreeMap是按照key（建）有序来排序的
        //LinkedHashMap是按照插入顺序排序的
        //HashMap是无序的
        map.put("tom",10);
        map.put("jerry",3);
        map.put("tom",5);
        map.put("ben",3);
        System.out.println(map.get("tom"));     //用建调值
        System.out.println(map.get("jerry"));
        //Map的key（建）是不允许元素重复的，值是最后一次放入的建对应的
        //Map的key（建）不允许重复但是值可以重复
        //Set中的元素也不许重复，HashMap里的建充当HashSet里的值

        Set<String> keys = map.keySet();
        //keySet方法的作用是将映射的建全取出来组成一个Set
        //但这个set并不是java.util.Set,而是class.keySet
        //但keySet实现了Set接口，但其中大部分方法没实现会抛异常
        Set<String> keys1 = new HashSet<>(keys);//这是完整Set
        //for(String s : keys)
          //  keys1.add(s);  用这个将map.keySet全导入进来  或者在上面括号里直接写keys
        keys1.add("sss");

        //将一个List集合中的重复元素去掉？
        //ArrayList中没有重复元素，Set中有重复元素，所以遇到重复就像Set
        List<Integer> list = new ArrayList<>() ;
        list.add(1);
        list.add(2);
        list.add(1);
        Set<String> keys2 = new HashSet(list); //去掉重复元素用这句话
        keys2.forEach(System.out::println);


        for(String key : map.keySet()){  //把所有建循环一遍
            System.out.printf("%-5s:%-3d",key,map.get(key));
        }
        System.out.println();

        map.forEach((k,v)->System.out.printf("%-5s:%-3d",k,v));
    }
}
