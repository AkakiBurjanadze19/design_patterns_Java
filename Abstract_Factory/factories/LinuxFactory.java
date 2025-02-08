package Abstract_Factory.factories;

import Abstract_Factory.buttons.Button;
import Abstract_Factory.checkboxes.Checkbox;
import Abstract_Factory.buttons.LinuxButton;
import Abstract_Factory.checkboxes.LinuxCheckbox;

/* Each concrete factory extends basic factory and is responsible for creating products of single variety. */
public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
