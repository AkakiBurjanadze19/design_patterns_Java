package Abstract_Factory.buttons;

/* This is a macOS variant of a button */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOS Button has been painted.");
    }
}
