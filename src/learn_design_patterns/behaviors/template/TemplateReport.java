package learn_design_patterns.behaviors.template;

public abstract class TemplateReport {

    public void generateReport() {
        generateHeader();
        generateBody();
        generateFooter();
    }

    public abstract void generateHeader();
    public abstract void generateBody();
    public abstract void generateFooter();
}
