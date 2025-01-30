package _23_01_25.homeWork;

public class DebetCard extends Card {
    public DebetCard(String name, double balance) {
        super(name, balance);
    }

    public DebetCard(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "DebetCard{" +
                "name = '" + name + '\'' +
                ", balance = " + balance +
                '}';
    }
}
