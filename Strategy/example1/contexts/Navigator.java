package Strategy.example1.contexts;

import Strategy.example1.strategies.RouteStrategy;

public class Navigator {
    private RouteStrategy strategy;

    public Navigator() {}

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void generateRoute(String A, String B) {
        strategy.buildRoute(A, B);
    }
}
