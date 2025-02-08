package Builder.components;

public class GPSNavigator {
    private String route;;

    public GPSNavigator() {
        this.route = "45 Wall St, New York, NY 10005, United States";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return this.route;
    }
}
