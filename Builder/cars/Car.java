package Builder.cars;

import Builder.components.Engine;
import Builder.components.GPSNavigator;
import Builder.components.Transmission;
import Builder.components.TripComputer;

/* Car is a product class. */
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getType() {
        return this.carType;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return this.seats;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Transmission getTransmission() {
        return this.transmission;
    }

    public TripComputer getTripComputer() {
        return this.tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return this.gpsNavigator;
    }
}
