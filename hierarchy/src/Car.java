 class Car extends Transport implements Driveable, Service{
    private final Engine engine;
    public Car(String name, int speed, FuelType fuelType, Engine engine) {
        super(name, speed, fuelType);
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null");
        }
        this.engine = engine;

    }

    @Override
    public void displayInfo() {
        System.out.println(String.format("Car: %s,\nSpeed: %d km/h,\nfuelType: %s,\nEngine power: %d", this.getName(), this.getSpeed(), this.getFuelType(), this.engine.getPower()));
    }

     @Override
     public void drive() {
         System.out.println("Car is going...");
     }

     @Override
     public void stop() {
         System.out.println("Car stopped");
     }

     @Override
     public void service() {
         System.out.println("Servicing the car...");
     }
 }
