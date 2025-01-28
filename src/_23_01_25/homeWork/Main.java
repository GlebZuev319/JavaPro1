package _23_01_25.homeWork;

public class Main {
    public static void main(String[] args) {

        Card card1 = new Card("John Doe");
        Card card2 = new Card("Jane Doe", 500);

        card1.deposit(300);

        card2.withdraw(150);

        System.out.println(card1.displayBalance());
        System.out.println(card2.displayBalanceDifferentCurrencies());

        System.out.println(card1);
        System.out.println(card2);
    }
}
