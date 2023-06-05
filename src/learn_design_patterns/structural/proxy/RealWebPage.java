package learn_design_patterns.structural.proxy;

public class RealWebPage implements WebPage {

    private String url;

    public RealWebPage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        System.out.println("Display webpage: " + url);
    }
}
