package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<Integer> list =
                Arrays.asList(1, 5, 9, 14, 19, 20, 25, 30);
        IntegerFilter filter = new IntegerFilter();

        System.out.println("IntegerFilter:");
        printList(list, filter);

        System.out.println("Klasa anonimowa:");
        printList(list, new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer < 10;
            }
        });

        System.out.println("Lambda:");
        printList(list, (i) -> i < 21);

        List<String> strings = Arrays.asList("Ala", "ma", "kota");
        printList(strings, (str) -> str.startsWith("m"));

        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }

}