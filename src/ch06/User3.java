package ch06;

import java.util.Comparator;

public class User3 implements Cloneable{
    private int id;
    private String name;
    //如果一个接口中没有任何方法，这个接口被认为是一个标记性方法
    //Cloneable表示这个类的对象是可以进行clone操作的 （clone克隆）


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public User3(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class User3Order implements Comparator<User3>{
    @Override public int compare(User3 o1,User3 o2){
        if(o1.getId() > o2.getId() ) return 1;
        else if(o1.getId() == o2.getId() ) return 0;
        else return -1;}

}