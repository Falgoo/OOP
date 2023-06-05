package learn_design_patterns.behaviors.template;

public class CustomerReport extends TemplateReport {
    @Override
    public void generateHeader() {
        System.out.println("Generating customer report header");
    }

    @Override
    public void generateBody() {
        System.out.println("Generating customer report body");
    }

    @Override
    public void generateFooter() {
        System.out.println("Generating customer report footer");
    }
}
