import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int linhas = sc.nextInt();
        int colunas = sc.nextInt();

        int[][] mat = new int[linhas][colunas];

        for (int i =0; i < linhas; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Number: ");
        int num = sc.nextInt();


        for (int i =0; i < linhas; i++){
            for (int j =0; j< mat[i].length; j ++){
                if (mat[i][j] == num){
                    System.out.println("-----------------");
                    System.out.printf("Position %d, %d\n", i, j);

// analisar colunas para ver esquerda e direita
                    if (j == 0){     // coluna 0
                        System.out.printf("Right: %d%n", mat[i][j + 1]);
                    } else if(j == mat[i].length - 1){         // coluna max
                        System.out.printf("Left: %d%n", mat[i][j -1]);
                    } else {
                        System.out.printf("Left: %d%n", mat[i][j-1]);
                        System.out.printf("Right: %d%n", mat[i][j+1]);
                    }
// analisar linhas para ver cima e baixo
                    if (i == 0){        // linha 0
                        System.out.printf("Down: %d%n", mat[i+1][j]);
                    } else if (i == linhas - 1) {            // linha max
                        System.out.printf("Up: %d%n", mat[i-1][j]);
                    } else{
                        System.out.printf("Up: %d%n", mat[i-1][j]);
                        System.out.printf("Down: %d%n", mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}