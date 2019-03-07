public class Empioyee1 {
    private String name ;
    private double salary ;  //privte表示私有只可以在这里用public表示公有
    private final double PI = 3.14; //final常量 这里只赋值一次别处不再赋值
    public static double pi; // 静态
    {
        name = "tom";
        salary = 2.2; //初始化模块 给变量赋值
    }
    static{  //静态模块
        System.out.println("static"); //static优先于所有非静态的执行 静态之间依次执行
    }

    public Empioyee1() {
        name = "ben";
        salary = 3.3;  //无参数构造器 有重复的后面覆盖前面的 成员变量和初始化块按照他们在类定义中的顺序依次执行，一定最后才执行构造器
    }                  //无参数构造器也叫默认构造器有机器生成的，一旦写了一个构造器机器就不在生成默认的了，最好手动添加无参数构造器

    public Empioyee1(String name, double salary) { //有参数构造器 构造器就是用来创建对象的
        this.name = name;   //this后面一定跟着类当中的属性和方法（类的变量）后面的是构造器里的变量name不一样的
        this.salary = salary;  //没有this方法中的变量会遮蔽类的变量
    }   //方法即构造器的变量名 类看开头

    @Override
    public String toString() {
        return "Empioyee1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    int fun(int i){  //这个叫方法
        return 0;
    }
    void Empioyee1(){ //写的不好的方法，首字母应该小写 这不是构造器 构造器没返还值 方法有

    }

    public void setName(String name) { //get和set在创建对象后，提供了查看和修改对象中属性的可能 也可把私有调出Test7
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Empioyee1 tom = new Empioyee1();
        Empioyee1 jerry = new Empioyee1("jerry",1000);
        System.out.println(tom);//直接打印一个对象时，默认调用toString方法
                                 //系统默认toString是打印类名@加哈希吗 所以我们要自己写
                                 //例 return "["+name+","+salary+"]"
        tom.fun(1);
        tom.Empioyee1();
        System.out.println(tom.fun(1)); //void一定不能出现在打印语句里 return后是什么就返回什么

    }
}
