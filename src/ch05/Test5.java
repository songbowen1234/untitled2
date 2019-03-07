package ch05;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
       // Date date = new Date();

       // Class cl = Date.class; //获取date类反射固定写法  下面两种方法也可用
       // Class cl1 = date.getClass();
       // Class cl2 = Class.forName("java.util.Date");
        Class cl = User.class;
        Field [] fields = cl.getFields();  //属性 类数组
       // System.out.println(Arrays.toString(fields));
        for (int i= 0; i<fields.length;i++)
            System.out.println(fields[i]); //调出公有属性结果 getFields

        fields = cl.getDeclaredFields();
        for(Field field : fields)
        System.out.println(field); //可以调出私有属性结果 getDeclaredFields

        User tom = new User();  //改结果
        User jerry = new User();
        Field id = cl.getField("id") ;
        id.set(tom,1);
        id.set(jerry,2);

        Field name = cl.getDeclaredField("name");
        name.setAccessible(true) ;
        name.set(tom,"tom");
        name.set(jerry,"jerry");

        System.out.println(tom + "\n" + jerry);


    }
}