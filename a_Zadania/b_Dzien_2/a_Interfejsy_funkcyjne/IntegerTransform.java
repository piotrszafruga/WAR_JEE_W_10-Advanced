package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

public class IntegerTransform implements Transform<Integer, Integer> {
    @Override
    public Integer transform(Integer integer) {
        return integer - 1;
    }
}
