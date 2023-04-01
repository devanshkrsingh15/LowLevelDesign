package DesignPatterns.FactoryAndAbstractFactoryPattern;

public class LuxuryVehicleFactory implements Factory {

    public Vehicle getVehicle(String vehicleType) {
        switch (vehicleType) {
            case "LAMBORGHINI":
                return new Lamborghini();

            case "MERCEDES":
                return new Mercedes();

            default:
                return null;
        }
    }

}
