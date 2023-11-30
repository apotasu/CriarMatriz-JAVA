import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite o numero de linhas:");
        int linha = scn.nextInt();
        System.out.print("Digite o numero de colunas:");
        int coluna = scn.nextInt();
        int[][] matriz = new int[linha][coluna];
        if (linha != coluna){
            System.out.println("A matriz não é quadrada");
        } else {
            System.out.println(Add(matriz, linha, coluna));
        }
    }
    public static String Add (int[][] matriz, int linha, int coluna) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j< coluna; j++){
                System.out.print("Digite o numero para ser adicionado na posição (" + i + ", " + j + "):");
                int num = scn.nextInt();
                matriz[i][j] = num;
            }
        }
        System.out.print("{"+matriz[0][0]);
        for (int i = 0; i<linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] == matriz[0][0]) {
                    System.out.print("");
                } else if(matriz[i][j] != matriz[0][0]) {
                    System.out.print(", " + matriz[i][j]);
                }
            }
        }
        System.out.print("}");
        return "";
    }
}
