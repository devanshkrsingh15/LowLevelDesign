package DesignPatterns.FactoryAndAbstractFactoryPattern;

public class VehicleFactory {
    public Factory getFactory(String factoryType) {
        switch (factoryType) {
            case "LUXURY":
                return new LuxuryVehicleFactory();

            case "ORDINARY":
                return new OrdinaryVehicleFactory();

            default:
                return null;
        }
    }
}
