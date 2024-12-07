package Computer.KeyBoard;

public class KeyBoard {
    private KeyBoardType type;
    private Illuminate illuminate;
    private double weight;

    public KeyBoard(KeyBoardType type, Illuminate illuminate, double weight) {
        this.type = type;
        this.illuminate = illuminate;
        this.weight = weight;
    }

    public KeyBoardType getType() {
        return type;
    }

    public void setType(KeyBoardType type) {
        this.type = type;
    }

    public Illuminate getIlluminate() {
        return illuminate;
    }

    public void setIlluminate(Illuminate illuminate) {
        this.illuminate = illuminate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "KeyBoard{" +
                "type=" + type +
                ", illuminate=" + illuminate +
                ", weight=" + weight +
                '}';
    }
}
