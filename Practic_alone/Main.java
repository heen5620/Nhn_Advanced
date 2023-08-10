package Practic_alone;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(15);

        int sum = 0;

        Iterator<Integer> s = number.iterator();

        for (Integer integer : number) {
            sum += s.next();
        }
        System.out.println(sum);
    }
}
