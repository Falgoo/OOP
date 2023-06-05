package learn_design_patterns.behaviors.template;

public class SaleReport extends TemplateReport {
    @Override
    public void generateHeader() {
        System.out.println("Generating sale report header");
    }

    @Override
    public void generateBody() {
        System.out.println("Generating sale report body");
    }

    @Override
    public void generateFooter() {
        System.out.println("Generating sale report footer");
    }
}
