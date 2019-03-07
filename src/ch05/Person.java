package ch05;

import java.util.Objects;

public abstract class Person {  //抽象类
    private String name;
    private int j;

    public Person(){}  //抽象类可以有构造器

    public abstract void foo(); //一个类中有抽象方法，这个类必须是抽象类
                                //抽象方法没有方法体即没有{}
                                //抽象方法必须在子类中被覆盖（重写）如果不覆盖
                                //子类也必须被标记为抽象类
                                //父类方法是普通方法，子类可以对其覆盖，甚至可以将其覆盖为抽象的
    public void goo(){ //普通方法

    }



    @Override       //生成equals方法
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return j == person.j &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, j);
    }
}
