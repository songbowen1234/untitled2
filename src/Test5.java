import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test5 {
    public static void main(String[] args) {
       //LocalDate now = LocalDate.now();
      //  System.out.println(now);
       // System.out.println(now.getYear());

       // LocalDate localDate = LocalDate.of(1995, 5, 8);
       // System.out.println(localDate);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime localTime = LocalTime.of(15,45,55);
        System.out.println(localTime);
        System.out.println(LocalDateTime.of(LocalDate.now(),LocalTime.now() ));
    }

}
