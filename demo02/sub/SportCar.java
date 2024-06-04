package demo02.sub;

import demo02.Car;

public class SportCar extends Car {

    private double efficiency;

    public SportCar(double topSpeed){
        super(topSpeed, 50.0, 2);
        if (topSpeed > 200.0){
            efficiency = 200.0 / topSpeed;
        } else {
            efficiency = 1.0;
        }
    }

    public double getEfficiency(){
        return efficiency;
    }

    public double range(){
        return 100 * fuelTankCapacity * efficiency / LITRE_PER_100KM;
    }

    public double getTopSpeed(Car car){
        return car.getTopSpeed();
    }
}
