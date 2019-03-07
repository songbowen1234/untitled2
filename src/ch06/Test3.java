package ch06;

public class Test3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User3 tom = new User3(1,"Tom");
        User3 tomClone = (User3)tom.clone(); //tom.clone();克隆

        System.out.println("Tom:"+tom);
        System.out.println("TomClone:"+tomClone);

        System.out.println(tom==tomClone );
    }
}
