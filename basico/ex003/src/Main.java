import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;
        System.out.print("A: ");
        A = sc.nextInt();
        System.out.print("B: ");
        B = sc.nextInt();
        System.out.print("C: ");
        C = sc.nextInt();
        System.out.print("D: ");
        D = sc.nextInt();
        diferenca = (A * B - C * D);
        System.out.printf("Diferença: %d", diferenca);

        sc.close();
    }
}
