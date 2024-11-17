public class Ship extends Transport implements Driveable, Service{
    private final Engine engine;
    public Ship(String name, int speed, FuelType fuelType, Engine engine) {
        super(name, speed, fuelType);
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null");
        }

        this.engine = engine;
    }

    @Override
    public void displayInfo() {
        System.out.println(String.format("Ship: %s,\nSpeed: %d,\nFuelType: %s,\nEngine power: %d", this.getName(), this.getSpeed(), this.getFuelType(), this.engine.getPower()));
    }

    @Override
    public void drive() {
        System.out.println("Ship is going...");
    }

    @Override
    public void stop() {
        System.out.println("Ship stopped");
    }

    @Override
    public void service() {
        System.out.println("Servicing the ship...");
    }
}
