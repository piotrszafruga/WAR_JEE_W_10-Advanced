package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> list =
                Arrays.asList(1, 5, 9, 14, 19, 20, 25, 30);
        IntegerFilter filter = new IntegerFilter();
        IntegerTransform transform = new IntegerTransform();

        System.out.println("IntegerTransform:");
        create(list, filter, transform);


    }

    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {
        List<T> list = new ArrayList<>();

        for (S s : src) {
            if (f.check(s)) {
                list.add(t.transform(s));
            }
        }
        System.out.println(list);

        return list;
    }
}
