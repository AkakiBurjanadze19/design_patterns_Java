package Abstract_Factory.buttons;

/* This is a windows variant of a button. */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button has been painted.");
    }
}
