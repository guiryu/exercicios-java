import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        if (x % 2 == 0){
            System.out.printf("O número %d é par", x);
        }
        else{
            System.out.printf("O número %d é ímpar", x);
        }

        sc.close();
    }
}