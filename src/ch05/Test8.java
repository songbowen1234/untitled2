package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test8 {
    //用反射创建一个数组
    public static void main(String[] args) {
        Object array = Array.newInstance(int.class,10);//创建一个长度为10的整型数组
        int[] newArray = (int[])array;
        System.out.println(Arrays.toString(newArray ));
    }

}
