package _23_01_25.homeWork;

public class Card {

    String name;

    double balance;

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                " Dollars" +
                '}';
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        } else{
            System.out.println("Сумма депозита должна быть положительной");
        }
    }

    public static void withdraw(double amount){
        if(balance - amount >= 0){
            balance -= amount;
        } else{
            System.out.println("Не достаточно средств");
        }
    }

    public double displayBalance(){
        return getBalance();
    }

    public StringBuilder displayBalanceDifferentCurrencies(){

        double balanceEuro = balance*0.96;
        double balanceYuan = balance*7.28;

        StringBuilder sb = new StringBuilder();
        sb.append(balance).append(" Dollars. \n").
                append(balanceEuro).append(" Euros. \n").
                append(balanceYuan).append(" Yuans.");

        return sb;
    }
}