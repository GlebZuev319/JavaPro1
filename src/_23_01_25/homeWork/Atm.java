package _23_01_25.homeWork;

public class Atm {

    public static double deposit(Card card, double amount){
        if(amount > 0){
            card.balance += amount;
        }else{
            System.out.println("Сумма депозита должна быть положительной");
        }
        return card.balance;
    }

    public static double withdraw(Card card, double amount){
        if(card instanceof CreditCard){
            card.balance -= amount;
            if(card.balance < 0){
                ((CreditCard) card).overdraft = Math.abs(card.balance);
            }
        }else{
            if(card.balance - amount >= 0){
                card.balance -= amount;
            }else{
                System.out.println("Недостаточно средств");
            }
        }
        return card.balance;
    }

    public static double displayBalance(Card card){
        return card.balance;
    }
}
