class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String acc, double bal){
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amount){ balance += amount; }
    void withdraw(double amount){ balance -= amount; }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String a, double b){ super(a,b); }
}

class CreditAccount extends BankAccount {
    CreditAccount(String a, double b){ super(a,b); }
}