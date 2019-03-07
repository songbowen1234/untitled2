package ch09;

import java.util.Stack;

public class Test4 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //栈后进先出
        stack.push(3); //将元素压入栈
        stack.push(5);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.pop()); //将栈顶元素弹出
    }
}
