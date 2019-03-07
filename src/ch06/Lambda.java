package ch06;

import java.util.Comparator;

@FunctionalInterface
//表示这个接口是个函数式接口
public interface Lambda {
    Integer run(Integer i, Double d);
    //void f(int a,double b){
    //i = i+1;不行下面用i，所以i不可以变
    //d= d+1;这个可以但是下面用法d，d也不可变
    //Lambda中使用的方法参数是不能被修改的
    //Comparator c = (x,y)->{
     //   System.out.println(i);
      //  return 0;
    //};
}
