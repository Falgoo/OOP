package nguyenxuannghia_20001954.lab11.factory_method.exercise1;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows click event");
    }
}
