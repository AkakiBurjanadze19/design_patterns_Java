package Abstract_Factory.buttons;

/* This is a Linux variant of a button. */
public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Linux button has been painted.");
    }
}
