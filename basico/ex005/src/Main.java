import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n1, n2, c1, c2;
        double v1, v2, valor;

        System.out.print("Produto 1: ");
        c1 = sc.nextInt();
        n1 = sc.nextInt();
        v1 = sc.nextDouble();

        System.out.print("Produto 2: ");
        c2 = sc.nextInt();
        n2 = sc.nextInt();
        v2 = sc.nextDouble();


        valor = n1 * v1 + n2 * v2;
        System.out.printf("Valor final = R$%.2f", valor);

        sc.close();
    }
}