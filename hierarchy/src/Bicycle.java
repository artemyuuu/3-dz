public class Bicycle extends Transport implements Driveable, Service {
    public Bicycle(String name, int speed, FuelType fuelType) {
        super(name, speed, FuelType.NONE);

    }

    @Override
    public void displayInfo() {
        System.out.println(String.format("Bicycle: %s,\nSpeed: %d,\nFuelType: %s", this.getName(), this.getSpeed(), this.getFuelType()));
    }

    @Override
    public void drive() {
        System.out.println("Bicycle is going...");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }

    @Override
    public void service() {
        System.out.println("Servicing the bicycle...");
    }

    public class Seat {
        public void up() {
            System.out.println("Up");
        }

        public void down() {
            System.out.println("Down");
        }
    }

    public class HandleBar {
        public void straight() {
            System.out.println("Go straight");
        }

        public void right() {
            System.out.println("Turn left");
        }

        public void left() {
            System.out.println("Turn left");
        }

        public void speed() {
            System.out.println("Turn on speed mode");
        }
    }
}
