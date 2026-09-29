class BankAccount {

    String name;
    int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        
        balance += amount;
    
    }

    public void showBalance() {
        System.out.println(balance);
    }

    public void withdraw(int amount) {
        if (balance >=amount) {
            balance -= amount;
        }
        else{
            System.out.println("U Too Poor.");
        }
    }
    
    
}

public class BankProblem {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Oliver", 50);
        account.deposit(150);
        account.showBalance();
        account.withdraw(70);
        account.showBalance();
        account.withdraw(200);
        account.showBalance();
    }
}

