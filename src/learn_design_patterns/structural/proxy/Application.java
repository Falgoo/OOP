package learn_design_patterns.structural.proxy;

public class Application {

    public static void main(String[] args) {
        WebPage webPage1 = new ProxyWebPage("https://test.com");
        WebPage webPage2 = new ProxyWebPage("https://testcv.com");

        webPage1.display();
        webPage2.display();
        webPage1.display();
    }
}
