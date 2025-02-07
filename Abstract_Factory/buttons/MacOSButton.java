package Abstract_Factory.buttons;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOS Button has been painted.");
    }
}
