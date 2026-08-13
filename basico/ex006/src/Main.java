import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A, B, C, pi=3.14159;
        double triangulo, circulo, trapezio, quadrado, retangulo;
        System.out.print("Valores (A, B, C): ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2;
        circulo = pi * Math.pow(C, 2);
        trapezio = (A + B) * C / 2;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;

        System.out.printf("Triângulo: %.3f\n", triangulo);
        System.out.printf("Círculo: %.3f\n", circulo);
        System.out.printf("Trapézio: %.3f\n", trapezio);
        System.out.printf("Quadrado: %.3f\n", quadrado);
        System.out.printf("Retângulo: %.3f\n", retangulo);

        sc.close();
    }
}
