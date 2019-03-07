package ch08;

public class Test1 <T,D>{  //范型类（类应用范型）
    private T date;
    public D num;
    private String name;

    public static <A>A f(){  //范型方法
        A a = null;
        return a;
    }

    public static <B> B getMiddle(B... b){ //带参数范型方法
        return b[b.length/2];
    }
    public static <C extends Comparable> C min(C[] c){ //范型类限制规则演示
        if(c==null || c.length==0)
            return null;
        C smallest = c[0];
        for(int i = 1;i<c.length;i++)
            if(smallest.compareTo(c[i])>0) smallest = c[i];
            return smallest;
    }
}
