package learn_design_patterns.behaviors.template;

public class InventoryReport extends TemplateReport {
    @Override
    public void generateHeader() {
        System.out.println("Generating inventory report header");
    }

    @Override
    public void generateBody() {
        System.out.println("Generating inventory report body");
    }

    @Override
    public void generateFooter() {
        System.out.println("Generating inventory report footer");
    }
}
