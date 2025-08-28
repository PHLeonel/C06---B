import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] pos = new int[2][2];   
        int[][] bomba = new int[2][2]; //matrix 2x2

        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        
        int bombaLinha = rand.nextInt(2);
        int bombaColuna = rand.nextInt(2);
        bomba[bombaLinha][bombaColuna] = 1; //nesse spot aí tem bomba

        System.out.println("bem vindo ao meu campo minado 2x2");
        System.out.println("as posições vão de (0,0) até (1,1)");

        while (true){
            
            System.out.println("digita a linha (0 ou 1): ");
            int linha = entrada.nextInt();
            System.out.println("digita a coluna (0 ou 1): ");
            int coluna = entrada.nextInt();

            pos[linha][coluna] = 1; //o spot q ele escolheu

            if (bomba[linha][coluna] == 1) {
                System.out.println("morreste.");
                System.out.println("posição da bomba aí: ");
                System.out.println("linha: " + bombaLinha);
                System.out.println("coluna: " + bombaColuna);
            } else {
                System.out.println("safe, vc ganhou.");
                break;
            }
        }

        entrada.close();
    }
}
