public class Vehicle {
    Strategy drivStrategy;
    Vehicle(Strategy drivStrategy){
        this.drivStrategy = drivStrategy;
    }

    public void drive(){
        this.drivStrategy.drive();
    }
}
