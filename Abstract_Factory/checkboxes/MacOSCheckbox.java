package Abstract_Factory.checkboxes;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOS checkbox has been painted.");
    }
}
