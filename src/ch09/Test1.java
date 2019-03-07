package ch09;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("abc"); //在最后一个位置插入
        linkedList.addFirst("aaa"); //在第一个位置插入
        linkedList.addLast("zzz"); //在最后一个位置插入
        linkedList.forEach(System.out::println);
        linkedList.removeFirst(); //删除第一个元素
        linkedList.removeLast(); //删除最后一个元素
        linkedList.forEach(System.out::println);
    }
}
