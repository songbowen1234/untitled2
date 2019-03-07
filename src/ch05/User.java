package ch05;

public class User {
    private String name;
    private int age;
    public int id;

    public void foo(){
        System.out.println("foo,,,,,,,,");

    }
    private void goo(int i, double d){
        System.out.println("goo,,,,,,,,");

    }

    public User() {
    }

    private  User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';

    }
}
