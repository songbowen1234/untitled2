public class Test9 {
    double foo(int i, double d){
        i = i + 1; //
        d = d + 1;
        return i + d;
    }

    public static void main(String[] args) {
        Test9 t = new Test9();
        int i = 1;
        double d = 2;
        System.out.println("foo:" +t.foo(i,d));
        System.out.printf("i=%d,d=%f",i,d);
    }
}
