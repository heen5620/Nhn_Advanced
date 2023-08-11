package practice;

import java.util.ArrayList;
import java.util.Iterator;


public class FractionalTest {
    private FractionalTest() {}

    public static void main(String[] args) {

        ArrayList<Fractional> list = new ArrayList<>();
        list.add(new Fractional(4, 8));
        Iterator<Fractional> iterator = list.iterator();
        Fractional sum =
                Mathx.reduceIf(fractional -> true, Fractional::add, new Fractional(0, 1), iterator);
        System.out.println(sum);
    }
}
