package Builder;

import Builder.builders.CarBuilder;
import Builder.builders.CarManualBuilder;
import Builder.cars.Car;
import Builder.cars.Manual;
import Builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();

        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);

        Manual carManual = manualBuilder.getResult();

        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
