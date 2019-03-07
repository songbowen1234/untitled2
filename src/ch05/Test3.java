package ch05;

public class Test3 {
    //所有的8个基本类型都有相对应的类类型，即包装器类型
    //我们将基本类型送给包装器称为装箱，反之叫拆箱
    //包装器可以取值位null，这是基本类型没有的
    //number是所有数值类型的父类 Number n = 1；
    public static void main(String[] args) {
        Byte b = 1;         Byte b1 = b;
        Short s = 1;
        Integer  i = 1;
        Long l = 1L;

        Float f = 3.12f;
        Double d = 3.14;

        Character c = 'a';
        Boolean bool = true;


    }
}
