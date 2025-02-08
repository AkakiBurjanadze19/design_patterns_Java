package Builder.builders;

import Builder.cars.Car;
import Builder.cars.CarType;
import Builder.components.Engine;
import Builder.components.GPSNavigator;
import Builder.components.Transmission;
import Builder.components.TripComputer;

/* Concrete builders define steps defined in the common interface. */
public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(this.carType, this.seats, this.engine, this.transmission, this.tripComputer, this.gpsNavigator);
    }
}
