package ch06;

public class Outer {  //嵌套内部类
    public void f(){

    }
    private int i = 1;
    /*静态内部类和嵌套内部类用法
    *这两种嵌套的做法是为了将内部类隐藏，使得外部类以外的类无法使用他们
    * 但是当内部类要访问外部类成员和方法时，就要使用嵌套内部类
    * 当不想用内部类访问外部类成员和方法时，就用静态内部类
     */

    public class Inner{ //class前加static是静态内部类，静态内部类无法访问外部类内容
        public void g(){
            //内部类访问外部类内容,用外部类名.this.
            Outer.this.f() ;
            Outer.this.i++;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner(); //创建内部类对象
        //Outer.Inner inner = new Outer.Inner(); 静态内部类构建对象无需外部类的对象
        //内部类生成class文件后，文件名是外部类$内部类
    }
}
