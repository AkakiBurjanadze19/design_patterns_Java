package Abstract_Factory.factories;

import Abstract_Factory.buttons.Button;
import Abstract_Factory.checkboxes.Checkbox;
import Abstract_Factory.buttons.WindowsButton;
import Abstract_Factory.checkboxes.WindowsCheckbox;

/* Each concrete factory extends basic factory and is responsible for creating products of single variety. */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
