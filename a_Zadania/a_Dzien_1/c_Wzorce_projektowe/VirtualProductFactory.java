package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Factory.ProductFactory;

public class VirtualProductFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new VirtualProduct();
    }
}
