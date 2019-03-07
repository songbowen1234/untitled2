import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10)
            System.out.printf("%-3d",i);
        System.out.println("hello");

        i = 0;
        var sum = 0;
        while (i++ < 10)
            sum+=i;
        System.out.printf("sum is: %d", sum);

        Scanner in = new Scanner(System.in);
        var count = in.nextInt();
        i = 0; sum = 0;
        while(i++ < count)
            sum += i;
        System.out.printf("sum is: %d",sum);

    }
}
