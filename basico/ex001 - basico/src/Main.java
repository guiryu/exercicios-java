import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x, y, resultado;

        System.out.print("Digite um valor inteiro x: ");
        x = sc.nextInt();
        System.out.print("Digite outro valor inteiro y: ");
        y = sc.nextInt();

        resultado = x + y;

        System.out.printf("Soma = %d", resultado);

        sc.close();
    }
}