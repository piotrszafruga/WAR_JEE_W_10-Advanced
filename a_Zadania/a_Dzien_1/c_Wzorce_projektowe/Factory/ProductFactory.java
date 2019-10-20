package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Factory;

import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.*;

public interface ProductFactory {

    Product createProduct();
    default Product createProduct(ProductType type) {
        //1 - simple
        //2 - advanced
        //3 - simple

        switch (type) {
            case SIMPLE:
                return new SimpleProduct();
            case ADVANCED:
                return new AdvancedProduct();
            case VIRTUAL:
                return new VirtualProduct();
                default:
                    throw new IllegalArgumentException();

        }
    }
}
