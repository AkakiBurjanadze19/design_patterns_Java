package Strategy.example1.strategies;

/* Concrete example of a route strategy */
public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String A, String B) {
        System.out.println("Walking route from " + A + " to " + B + " is ready.");
    }
}
