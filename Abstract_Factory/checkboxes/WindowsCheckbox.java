package Abstract_Factory.checkboxes;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows checkbox has been painted.");
    }
}
