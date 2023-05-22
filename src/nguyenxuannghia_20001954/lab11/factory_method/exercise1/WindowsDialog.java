package nguyenxuannghia_20001954.lab11.factory_method.exercise1;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
