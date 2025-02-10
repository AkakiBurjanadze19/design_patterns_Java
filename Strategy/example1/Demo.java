package Strategy.example1;

import Strategy.example1.contexts.Navigator;
import Strategy.example1.strategies.PublicTransportStrategy;
import Strategy.example1.strategies.RoadStrategy;
import Strategy.example1.strategies.RouteStrategy;
import Strategy.example1.strategies.WalkingStrategy;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting location: ");
        String startingLocation = scanner.nextLine();

        System.out.print("Enter ending location: ");
        String endingLocation = scanner.nextLine();

        System.out.print("What type of route do you prefer? ");
        String route = scanner.nextLine().toLowerCase();

        Navigator navigator = new Navigator();

        if (route.equals("walking")) {
            RouteStrategy walkingStrategy = new WalkingStrategy();
            navigator.setStrategy(walkingStrategy);
        } else if (route.equals("road")) {
            RouteStrategy roadStrategy = new RoadStrategy();
            navigator.setStrategy(roadStrategy);
        } else if (route.equals("public transport")) {
            RouteStrategy publicTransportStrategy = new PublicTransportStrategy();
            navigator.setStrategy(publicTransportStrategy);
        } else {
            System.err.println("Such an option doesn't exist.");
        }

        navigator.generateRoute(startingLocation, endingLocation);
    }
}
