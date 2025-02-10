package Strategy.example1.strategies;

/* Concrete example of a route strategy */
public class RoadStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String A, String B) {
        System.out.println("Road route from " + A + " to " + B + " is ready.");
    }
}
