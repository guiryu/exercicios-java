package util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double DollarReais(double amount, double dollarValue){
        return dollarValue * amount * (1 + IOF);
    }

}
