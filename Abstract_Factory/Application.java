public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(UI_Factory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}