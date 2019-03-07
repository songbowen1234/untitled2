package ch09;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); //HashSet TreeSet
        set.add(1);
        set.add(3);
        set.add(1);
        set.add(8);
        set.add(5);

        set.forEach(System.out::println);
    }
}
