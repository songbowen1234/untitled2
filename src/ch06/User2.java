package ch06;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class User2 {
    private int id;
    private String name;

    public User2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class DateSort implements Comparator <LocalDate>{
    @Override
    public int compare(LocalDate o1,LocalDate o2){
        if(o1.getDayOfMonth() > o2.getDayOfMonth()) return 1;
        else if(o1.getDayOfMonth() == o2.getDayOfMonth() ) return 0;
        else return -1;
    }
}
class Test2{
    public static void main(String[] args) {
        LocalDate l1 = LocalDate.of(1995,5,9);
        LocalDate l2 = LocalDate.of(1994,5,9);
        LocalDate l3 = LocalDate.of(1997,5,9);
        LocalDate l4 = LocalDate.of(1996,5,9);
        LocalDate [] dates = {l1,l2,l3,l4};

        Arrays.sort(dates,new DateSort());
        Arrays.stream(dates).forEach(System.out::println );
    }
}