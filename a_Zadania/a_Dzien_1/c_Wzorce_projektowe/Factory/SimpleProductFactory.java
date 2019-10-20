package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Factory;

import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Product;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.SimpleProduct;

public class SimpleProductFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new SimpleProduct();
    }
}
