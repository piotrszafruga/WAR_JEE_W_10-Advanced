package a_Zadania.a_Dzien_1.b_Interfejsy;

public class UrlMain {
    public static void main(String[] args) {

        StandardUrl standardUrl = new StandardUrl();

        System.out.println(
                standardUrl.getParam(
                        "param1",
                        "url_example?param1=99&param2=string"));

        Url url = new StandardUrl();

        System.out.println(
                standardUrl.getParam(
                        "param2",
                        "url_example?param1=99&param2=string"));
    }
}
