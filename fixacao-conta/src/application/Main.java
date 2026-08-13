package application;
import java.util.Scanner;
import java.util.Locale;
import entities.ContaBancaria;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ContaBancaria c1 = new ContaBancaria();
        double saldo = 0;

        System.out.print("Enter account number: ");
        int numAccount = sc.nextInt();
        System.out.print("Enter account name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        char deposit = sc.next().charAt(0);
        if (deposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            saldo = sc.nextDouble();
        }
        c1.Account(numAccount, name, saldo);


        System.out.println();
        System.out.println("Account data:");
        c1.printData();

        System.out.println();
        System.out.print("Enter a deposit value: ");
        c1.deposit(sc.nextDouble());
        System.out.println("Updated data:");
        c1.printData();

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        c1.withdraw(sc.nextDouble());
        System.out.println("Updated data:");
        c1.printData();

        sc.close();
    }
}
