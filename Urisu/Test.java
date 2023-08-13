package Urisu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 덧셈 이제 ArrayList로 받아서 덧셈, 곱셈 구하기 -> 성공
        // reduce 그냥 덧셈 곱셈 , reduceIf == 짝수만 구해서 덧셈, 곱셈
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(21);

        Iterator<Integer> iterator = list.iterator();

        // Multi mul = new Multi();
        // Number reult_mul = mul.apply(list.get(0), list.get(1));
        // System.out.println(reult_mul);

        // Plus plus = new Plus<>();
        // Number result = plus.apply(list.get(0), list.get(1));
        // System.out.println(result);

        // System.out.println(Mathx.reduce((x, y) -> x + y, 0, iterator));
        System.out.println(Mathx.reduceIf(x -> x % 2 != 0, (x, y) -> x + y, 0, iterator));

    }
}
