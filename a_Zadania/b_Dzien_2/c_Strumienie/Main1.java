package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        List<String> listOfStrings = getListOfString();

        System.out.println("1.");

        listOfStrings
                .stream()
                .map(String::toUpperCase)
                .filter(s ->
                        s.startsWith("S")
                                || s.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("2.");


        System.out.println("3.");

        String result = listOfStrings
                .stream()
                .sorted(String::compareToIgnoreCase)
                .map(s -> {
                    if (s.length() > 3) {
                        return s.substring(0, 3);
                    } else {
                        return s;
                    }
                })
//                .collect(Collectors.joining(","));
                .reduce((s1,s2) -> s1 + "," + s2)
                .orElse("");

        System.out.println(result);
    }


    private static List<String> getListOfString() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna " +
                "aliqua. Ut enim ad minim veniam";
        String[] list = text.split("\\,\\s|\\s|\\.\\s");
        return Arrays.asList(list);

//        return Arrays.asList(
//                "Lorem",
//                "Ipsum",
//                "dolor",
//                "sit",
//                "amet",
//                "consectetur",
//                "adipiscing",
//                "elit",
//                "sed",
//                "do",
//                "eiusmod",
//                "tempo",
//                "incididunt",
//                "ut",
//                "labore",
//                "et",
//                "dolore",
//                "magna",
//                "aliqu",
//                "Ut",
//                "enim",
//                "ad",
//                "mini",
//                "veniam"
//        );
    }
}
