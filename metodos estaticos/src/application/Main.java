package application;

import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? $");
        double dollarValue = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double reais = CurrencyConverter.DollarReais(amount, dollarValue);
        System.out.printf("Amount to be paid in reais R$%.2f\n", reais);

        sc.close();
    }
}