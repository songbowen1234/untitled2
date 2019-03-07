public class X {
   void a(){
        System.out.println("xx");
    }
}

class Y extends X{
    void a (){
        System.out.println("yy");
    }
    void b (){
        System.out.println("BB");
    }

    public static void main(String[] args) {
        X x = (X)new Y();
        x.a();

    }
}
