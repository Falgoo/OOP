package nguyenxuannghia_20001954.lab11.factory_method.exercise1;

public abstract class Dialog {

    public abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}
