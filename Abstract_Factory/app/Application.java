package Abstract_Factory.app;

import Abstract_Factory.buttons.Button;
import Abstract_Factory.checkboxes.Checkbox;
import Abstract_Factory.factories.GUIFactory;

/* Factory users don't care which concrete factory they use since they work with factories and products through
abstract interfaces. */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}
