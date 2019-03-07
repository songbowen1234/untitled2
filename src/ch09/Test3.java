package ch09;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();//双端队列  PriorityQueue<>()优先级队列
        queue.offer(2); //元素放入队列 （入队列）
        queue.offer(1);
        queue.offer(1);
        queue.offer(3);
        queue.forEach(System.out::println); //lambda表达式中是并发运行的，不一定能有序打出来用迭代器打
        System.out.println(queue.peek()); //查看队列的第一个元素，不取出
        System.out.println(queue.poll()); //取出队列第一个元素，出队列


    }
}
