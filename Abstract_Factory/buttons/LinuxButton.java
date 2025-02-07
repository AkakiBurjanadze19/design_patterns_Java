package Abstract_Factory.buttons;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Linux button has been painted.");
    }
}
