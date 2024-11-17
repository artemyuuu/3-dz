public abstract class Transport {
    private String name;
    private int speed;
    private FuelType fuelType;

    public Transport(String name, int speed, FuelType fuelType) {
        if(speed < 0){
            throw new IllegalArgumentException("Speed cannot be negative");
        }
        this.name = name;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }


    public abstract void displayInfo();


}
