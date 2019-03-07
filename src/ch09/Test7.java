package ch09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {  //算法
        List<Integer> list = new ArrayList<>() ;
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(5);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        Collections.reverse(list); //将集合元素转置
        list.forEach(e-> System.out.printf("%-3d",e));

        System.out.println();

        Collections.sort(list); //将集合元素排序
        list.forEach(e-> System.out.printf("%-3d",e));

        System.out.println();

        Collections.shuffle(list); //将集合元素混洗（打乱）
        list.forEach(e-> System.out.printf("%-3d",e));

        System.out.println();

        Collections.sort(list);  //用二分检索法前要先排序
        System.out.println(Collections.binarySearch(list,8)); //这个叫二分检索法
        //得到结果是0或正数，那么这就是要查找的元素下标
        //如果是负数，意味着没找到，但是对这个负数求绝对值-1
        //得到后的数就是这个元素应该放入的位置，放入后这个集合依然是有序的



    }
}
