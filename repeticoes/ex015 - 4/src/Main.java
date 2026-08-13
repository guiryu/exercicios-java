import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X;
        System.out.print("Valor de X: ");
        X = sc.nextInt();

        for (int i = 1; i <= X; i+=2){
            System.out.printf("%d, ", i);
        }
        System.out.println("Fim");

        sc.close();
    }
}
