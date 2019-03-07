package ch08;

import java.util.Comparator;

public class User<T extends Comparable & Cloneable & Comparator> {
    private T name;
    private int age;
}
//类型限定:自定义范型类，自定义范型方法会用
//class User<T extends Cloneable>{
// }

//通配范型：通配范型一定带？，通配范型是一种类型，用在赋值运算符的左侧
//Pair<? extends Number> num = new Pair<Integer>();
//   <子类 extends 父类>
//Pair<? super Number> num1 = new Pair<Object>();
//   <父类 extends 子类>
//Pair<?> num2 = new Pair<LocalDate>();
//   <任意类>

//T和Object区别？网上可搜