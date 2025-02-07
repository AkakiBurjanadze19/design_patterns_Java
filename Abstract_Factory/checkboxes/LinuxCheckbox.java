package Abstract_Factory.checkboxes;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Linux checkbox has been painted.");
    }
}
