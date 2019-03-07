package ch05;

public abstract class Student extends Person {
    public String getDescription() {
        return "这是一个学生";
    }
    @Override
    public void goo(){

    }
    @Override //覆盖
    public abstract void foo();
}
