package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Factory;

import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.AdvancedProduct;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Product;

public class AdvancedProductFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new AdvancedProduct();
    }
}
