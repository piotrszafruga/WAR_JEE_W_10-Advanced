package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

public class AppConfig {

    private static AppConfig INSTANCE;

    public static synchronized AppConfig getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AppConfig();
        }
        return INSTANCE;
    }

    private AppConfig() {}
}
