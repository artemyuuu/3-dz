//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Engine eng = new DieselEngine(12);
        Plane plane = new Plane("plane", 100, FuelType.ELECTRIC, eng);
        plane.displayInfo();
        Engine eng2 = new PetrolEngine(10);
        Car car = new Car("Car", 50, FuelType.PETROL, eng2);
        car.displayInfo();
        Engine engShip = new ElectricEngine(23);
        Ship ship = new Ship("Ship", 90, FuelType.DIESEL, engShip);
        ship.displayInfo();
        Bicycle bike = new Bicycle("bike", 15, FuelType.NONE);
        bike.displayInfo();
        bike.drive();
        bike.service();
        Bicycle.Seat seat= bike.new Seat();
        seat.up();
        seat.down();
        Bicycle.HandleBar handleBar = bike.new HandleBar();
        handleBar.right();
    }
}