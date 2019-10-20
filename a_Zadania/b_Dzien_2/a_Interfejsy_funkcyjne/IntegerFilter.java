package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

public class IntegerFilter implements Filter<Integer> {

    @Override
    public boolean check(Integer v) {
        return v < 20;
    }

}
