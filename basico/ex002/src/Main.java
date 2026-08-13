import java.util.Scanner;
import java.util.Locale;
public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;
        double pi = 3.14159;

        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);

        System.out.printf("Área = %.4f", area);

        sc.close();
    }
}
