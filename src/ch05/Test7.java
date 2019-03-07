package ch05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test7 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       // Date date = new Date();

       // Class cl = Date.class; //获取date类反射固定写法  下面两种方法也可用
       // Class cl1 = date.getClass();
       // Class cl2 = Class.forName("java.util.Date");
        Class cl = User.class;

        Constructor [] constructors = cl.getConstructors() ;  //属性类数组
       // System.out.println(Arrays.toString(fields));
        for (int i= 0; i<constructors .length;i++)
            System.out.println(constructors [i]); //调出公有构造器 getFields

        constructors  = cl.getDeclaredConstructors();
        for(Constructor  constructor : constructors )
        System.out.println(constructor); //可以调出私有构造器 getDeclaredFields


       // Constructor constructorNoArgs = cl.getConstructor() ;
       // User user = (User)constructorNoArgs.newInstance();
       // System.out.println(user); //拿到不带参数构造器

       // Constructor constructor = cl.getConstructor(String.class,int.class,int.class);
       // user = (User)constructor.newInstance("tom",1,2);
        //System.out.println(user);



    }
    //user中没有构造器，默认打无参构造器
}