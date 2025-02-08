package Abstract_Factory.checkboxes;

/* This is a linux variant of a checkbox. */
public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Linux checkbox has been painted.");
    }
}
