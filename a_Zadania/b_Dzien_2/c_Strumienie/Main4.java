package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {

    public static void main(String[] args) {
        List<String> listOfStrings = getListOfString();

        //1.
        String result1 = listOfStrings
                .stream()
                .map(s -> Integer.toString(s.length()))
                .reduce((s1, s2) -> s1 + "," + s2)
                .orElse("");

        System.out.println(result1);

        //2.
        List<String> result2 = listOfStrings
                .stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());

        System.out.println(result2);

        //3.
        String result3 = listOfStrings
                .stream()
                .filter(s -> s.contains("c"))
                .reduce((s1, s2) -> s1 + "," + s2)
                .orElse("");

        System.out.println(result3);

        //4.
        Integer result4 = listOfStrings
                .stream()
                .map(String::length)
                .reduce((s1,s2) -> s1 + s2)
                .orElse(0);

        System.out.println(result4);

        //5.
        listOfStrings
                .stream()
                .limit(3)
                .sorted(String::compareToIgnoreCase)
                .forEach(System.out::println);

    }

    private static List<String> getListOfString() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna " +
                "aliqua. Ut enim ad minim veniam";
        String[] list = text.split("\\,\\s|\\s|\\.\\s");
        return Arrays.asList(list);
    }

}
