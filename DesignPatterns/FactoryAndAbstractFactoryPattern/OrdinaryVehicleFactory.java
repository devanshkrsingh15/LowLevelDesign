package DesignPatterns.FactoryAndAbstractFactoryPattern;

public class OrdinaryVehicleFactory implements Factory {
    public Vehicle getVehicle(String vehicleType) {
        switch (vehicleType) {
            case "ALTO":
                return new Alto();

            case "WAGONAR":
                return new Wagonar();

            default:
                return null;
        }
    }

}
