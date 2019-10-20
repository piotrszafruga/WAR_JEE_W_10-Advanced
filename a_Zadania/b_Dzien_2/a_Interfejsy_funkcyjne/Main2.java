package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list =
                Arrays.asList(1, 5, 9, 14, 19, 20, 25, 30);
        IntegerFilter filter = new IntegerFilter();
        IntegerTransform transform = new IntegerTransform();

        System.out.println("IntegerTransform:");
        printList(list, filter, transform);

        System.out.println("Klasa anonimowa:");
        printList(list, filter, new Transform<Integer,Integer>() {
            @Override
            public Integer transform(Integer integer) {
                return integer - 1;
            }
        });

        System.out.println("Lambda:");
        printList(list, filter, (i) -> ""+(i-1));
    }

    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }
}
