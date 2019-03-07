package ch14;

import java.util.*;

public class G {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> syncList = Collections.synchronizedList(list);
        //将一个普通集合转化为多线程安全

        Map<String,Integer> map = new HashMap<>() ;
        Map<String,Integer> syncMap = Collections.synchronizedMap(map);
        //将一个普通映射转化为多线程安全
    }
}
