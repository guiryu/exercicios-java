import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        double[] vect1 = new double[n];
        double[] vect2 = new double[n];
        System.out.println("Digite os valores do vetor A: ");

        for (int i=0; i<vect1.length; i++){
            vect1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i=0; i< vect2.length; i++){
            vect2[i] = sc.nextInt();
        }

        double[] vectRes = new double[n];
        System.out.println("Vetor resultante: ");
        for (int i=0; i< vect2.length; i++){
            vectRes[i] = vect1[i] + vect2[i];
        }

        for (int i=0; i<vectRes.length; i++){
            System.out.println(vectRes[i]);
        }

        sc.close();
    }
}