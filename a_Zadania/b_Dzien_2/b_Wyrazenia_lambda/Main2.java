package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main2 {

    public static void main(String[] args) {

        List<Object> listOfObjects = new ArrayList<>();
        listOfObjects.add("String");
       // listOfObjects.add(new Integer(1));
        listOfObjects.add(new BigDecimal(100));
        listOfObjects.add(new Main2());

//        listOfObjects
//                .stream()
//                .filter(
//                        object -> {
//                            return object instanceof String;
//                        }
//                ).forEach((string) -> System.out.println(string));

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        char[] charArray = string.toCharArray();

        //Zad 2:
        Predicate<Character> isDigit = (character) -> {
            //return ! Character.isLetter(character);
            try {
                Integer.parseInt("" + character);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        };

        //Zad 3:
        Predicate<Character> isDigit2 = (character) -> {
            //return Character.isDigit();
            try {
                Integer.parseInt("" + character);
                return false;
            } catch (NumberFormatException e) {
                return true;
            }
        };

        boolean isOnlyChars = true;
        for (char singleChar :charArray) {
            if(isDigit.test(singleChar)) {
                isOnlyChars = false;
                break;
            }
        }

        if (isOnlyChars) {
            System.out.println(string);
        }

        //Zad 4:
        Function<Integer, Integer> power = (num) -> {
            Integer res = 1;
            for (int i=1; i <= num; i++) {
                res *= i;
            }
            return res;
        };

        Function<Double,Double> square = (num) -> Math.pow(Math.sqrt(num), 2);

        System.out.println(power.apply(10));


    }



//    public static void checkStringType(Object object) {
//        if (object instanceof String) {
//            System.out.println(object);
//        }
//    }


}
