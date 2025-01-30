package _23_01_25.homeWork;

public class Atm {

    public static double deposit(Card card, double amount){
        card.deposit(amount);
        return card.balance;
    }

    public static double withdraw(Card card, double amount){
        if(card instanceof CreditCard){
            card.withdraw(amount);
        }else{
            card.withdraw(amount);
        }
        return card.balance;
    }

    public static double displayBalance(Card card){
        return card.displayBalance();
    }
}
