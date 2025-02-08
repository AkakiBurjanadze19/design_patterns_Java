package Abstract_Factory.checkboxes;

/* This is a macOS variant of a checkbox. */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOS checkbox has been painted.");
    }
}
