package ch05;

//参数可变的方法
//可变参数相当于一个数组
//一个方法只能有一个可变参数
//可变参数必须在参数列表最后
public class Test4 {
    void foo(int i, int...j){
        System.out.print(i + " ");
        for(int k = 0; k<j.length;k++)
            System.out.printf("%-3d",j[k]);
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();
        t4.foo(1);
        System.out.println("\n=============\n");
        t4.foo(1,2,3,4,5,6);
    }
}
