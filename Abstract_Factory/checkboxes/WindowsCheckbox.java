package Abstract_Factory.checkboxes;

/* This is a windows variant of a checkbox. */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows checkbox has been painted.");
    }
}
