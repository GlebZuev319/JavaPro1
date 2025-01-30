package _23_01_25.homeWork;

public class CreditCard extends Card{

    double overdraft;

    public CreditCard(String name, double balance) {
        super(name, balance);
    }

    public CreditCard(String name) {
        super(name);
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
        if(balance < 0){
            overdraft = Math.abs(balance);
        }
    }

    @Override
    public String toString() {
        if(balance >= 0){
            return "CreditCard{" +
                    "name = '" + name + '\'' +
                    ", balance = " + balance +
                    '}';
        }else{
            return "CreditCard{" +
                    "name = '" + name + '\'' +
                    ", overdraft = " + overdraft +
                    '}';
        }
    }
}
