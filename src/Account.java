public class Account {
    private int balance;
    public void deposit(int amount) {
        if (amount>=0)  balance = amount + balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {

        if ((amount > 0) && (amount < balance) )    balance = balance - amount;
        else if (amount > balance)  {
            System.out.println("Withdrawal amount exceeded account balance.");
        }

    }

    }

