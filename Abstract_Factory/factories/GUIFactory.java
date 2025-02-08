package Abstract_Factory.factories;

import Abstract_Factory.buttons.Button;
import Abstract_Factory.checkboxes.Checkbox;

/* Abstract factory knows about all (abstract) products */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
