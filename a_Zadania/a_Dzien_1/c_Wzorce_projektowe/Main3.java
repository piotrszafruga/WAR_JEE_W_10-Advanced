package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Factory.AdvancedProductFactory;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Factory.ProductFactory;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Factory.SimpleProductFactory;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3.BankAccount;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3.Facade.AtmApi;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3.Loan;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3.PhoneCard;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie3.Transfer;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie4.FacebookObserver;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie4.Post;
import a_Zadania.a_Dzien_1.c_Wzorce_projektowe.Zadanie4.TwitterObserver;

public class Main3 {
    public static void main(String[] args) {

        ProductFactory simpleFactory = new SimpleProductFactory();
        ProductFactory advancedFactory = new AdvancedProductFactory();
        ProductFactory virtualFactory = new VirtualProductFactory();

        Product simple = simpleFactory.createProduct();
        Product advanced = advancedFactory.createProduct();
        Product virtual = virtualFactory.createProduct();

        System.out.println(simple.getName());

        Product simple2 = advancedFactory.createProduct(ProductType.SIMPLE);
        System.out.println(simple2.getName());


        //Zad 3:
        AtmApi api = new AtmApi(new BankAccount(), new Loan(), new PhoneCard(), new Transfer());
        api.all(20);

        //Zad 4:
        Post post = new Post();
        post.setTitle("Some title");
        post.setContent("Some content");

        post.attach(new FacebookObserver());
        post.attach(new TwitterObserver());
        post.share();




    }
}
