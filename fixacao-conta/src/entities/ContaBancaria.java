package entities;

public class ContaBancaria {

    private String name;
    private double balance;
    private int id;

    public void Account(int number, String holder, double initialDeposit) {
        name = holder;
        id = number;
        deposit(initialDeposit);
    }

    public double getBalance() {
        return balance;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void printData(){
        System.out.printf("Account: %d, Holder: %s, Balance: $%.2f\n", id, name, balance);
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount + 5;
    }

}
