import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, fatorial = 1;
        n = sc.nextInt();

        for (int i = n; i>0; i--){
            fatorial *= i;
        }
        System.out.printf("O fatorial de %d é %d\n", n, fatorial);

        sc.close();
    }
}
