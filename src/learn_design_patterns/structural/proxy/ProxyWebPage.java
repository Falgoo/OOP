package learn_design_patterns.structural.proxy;

public class ProxyWebPage implements WebPage {

    private String url;
    private RealWebPage realWebPage;
    private int accessAccount;

    public ProxyWebPage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if (realWebPage == null) {
            realWebPage = new RealWebPage(url);
        }
        accessAccount++;
        displayAccount();
        realWebPage.display();
    }

    public void displayAccount() {
        System.out.println("Access count for " + url + ": " + accessAccount);
    }
}
