package ch05;
//枚举可以更好的限制变量的取值范围，让程序变得更好读
enum Gendar{
    F(0),M(1)
    ;
    int gendar;
    Gendar (int gendar){

        this.gendar = gendar;
    }

}

public enum Size { //enum表枚举 calss表类
    S("small"),A,B,C,A1; //后面还要写别的需要加；不然会错 不加可不写
    private int i = 1;//枚举可以加属性
    private String size;
    public void foo(){}// 可以加方法
    Size(){}           //可以加构造器
    Size (String s){
        this.size = s;
    }
}
