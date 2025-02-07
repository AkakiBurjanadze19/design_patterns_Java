package Abstract_Factory.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button has been painted.");
    }
}
