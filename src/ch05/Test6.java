package ch05;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test6 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       // Date date = new Date();

       // Class cl = Date.class; //获取date类反射固定写法  下面两种方法也可用
       // Class cl1 = date.getClass();
       // Class cl2 = Class.forName("java.util.Date");
        Class cl = User.class;
        Method [] methods = cl.getMethods();  //方法类数组
       // System.out.println(Arrays.toString(fields));
        for (int i= 0; i<methods .length;i++)
            System.out.println(methods [i]);//调出公有方法

        methods  = cl.getDeclaredMethods();
        for(Method  method : methods )
        System.out.println(method) ; //调出私有方法

        User user = new User();
        Method goo = cl.getDeclaredMethod("goo",int.class,double.class) ;
        goo.setAccessible(true); //方法私有必须加这句话固定格式
        goo.invoke(user,1,3.12); //单独调出私有方法 有参数需要加标示不然调不出会错

        Method foo = cl.getMethod("foo") ;
        foo.invoke(user);  //单独调出公有方法


    }
}