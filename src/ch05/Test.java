package ch05;

class A{};
public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = a1;

        System.out.println(a1.equals(a2)); //false
        //new出来的地址都不同
        System.out.println(a1==a2);        //false
        System.out.println(a1==a3);        //true
        //==比较的是两个对象的地址是否相等，与对象内容无关

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1.equals(s2));//true
        //string的equals对object（超类）的equals做了覆盖
        //覆盖后的规则是比较两个字符串内容是否相等
        System.out.println(s1==s2);        //false
        //new 出来的对象彼此都不用==比

        String s3 = "hello";
        String s4 = "hello";

        System.out.println(s3.equals(s4)); //true
        System.out.println(s3==s4);        //true

        Person1 p1 = new Person1("tpm",1);
        Person1 p2 = new Person1("tom",1);

        System.out.println(p1);
    }
}
