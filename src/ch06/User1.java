package ch06;

import java.util.Arrays;
import java.util.Comparator;

public class User1 {
    private int id;
    private String name;

    public User1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
//Comparator接口用于指定对象排序的方法，但是又无法修改类源代码吗的情况，即不能用Ccomparable时
class User1Order implements Comparator<User1> {

     @Override public int compare(User1 o1,User1 o2){
         if(o1.getId() > o2.getId() ) return 1;
         else if(o1.getId() == o2.getId() ) return 0;
         else return -1;
     }

}
class Test1{
    public static void main(String[] args) {
        User1  tom = new User1(1,"Tom");
        User1  ben = new User1(3,"Ben");
        User1  jerry = new User1(2,"Jerry");

        User1 []users = {tom,ben,jerry};
        Arrays.sort(users,new User1Order());
        Arrays.stream(users).forEach(System.out::println);
    }
}
