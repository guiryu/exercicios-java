import java.util.Scanner;
import java.util.Locale;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num, horas;
        double valorHora, salario;

        System.out.print("Número: ");
        num = sc.nextInt();
        System.out.print("Horas: ");
        horas = sc.nextInt();
        System.out.print("Valor por hora: ");
        valorHora = sc.nextDouble();
        salario = horas * valorHora;

        System.out.printf("NÚMERO = %d\n", num);
        System.out.printf("SALÁRIO = U$%.2f\n", salario);

        sc.close();
    }
}
