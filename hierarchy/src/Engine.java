sealed public class Engine permits PetrolEngine, DieselEngine, ElectricEngine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

}

final class PetrolEngine extends Engine {
    public PetrolEngine(int power) {
        super(power);
    }
}

final class DieselEngine extends Engine {
    public DieselEngine(int power) {
        super(power);
    }
}

final class ElectricEngine extends Engine {
    public ElectricEngine(int power) {
        super(power);
    }
}