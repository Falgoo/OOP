package learn_design_patterns.behaviors.template;

public class Application {

    public static void main(String[] args) {
        TemplateReport saleReport = new SaleReport();
        saleReport.generateReport();

        TemplateReport inventoryReport = new InventoryReport();
        inventoryReport.generateReport();

        TemplateReport customerReport = new CustomerReport();
        customerReport.generateReport();
    }
}
