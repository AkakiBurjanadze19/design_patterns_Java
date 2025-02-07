package Abstract_Factory;

import Abstract_Factory.app.Application;
import Abstract_Factory.factories.GUIFactory;
import Abstract_Factory.factories.LinuxFactory;
import Abstract_Factory.factories.MacOSFactory;
import Abstract_Factory.factories.WindowsFactory;

public class Demo {
    public static Application configureApplication() {
        Application app;
        GUIFactory factory = null;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else if (osName.equals("linux")) {
            factory = new LinuxFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
