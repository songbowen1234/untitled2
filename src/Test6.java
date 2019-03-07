public class Test6 {
    void fun(){
        System.out.println("123");
        return;
    }

    int  goo(){
        System.out.println("123");
        return 1;
    }

    double zoo(int d){
        return d+1.0;
    }
    public static void main(String[] args) {
        Test6 t = new Test6();
        t.fun();
        t.goo();
        t.zoo(2);
        System.out.println(t.goo());
        System.out.println(t.zoo(2));
    }
}
