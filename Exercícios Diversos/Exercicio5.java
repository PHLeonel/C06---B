import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int x = 0;
        int y = 1;

        while(x != y){
        System.out.println("Advinhe o Número de 1 a 10: ");
        y = entrada.nextInt();
        x = rand.nextInt(10) + 1; //gera um num aleatorio
        System.out.println("Deseja recomeçar o jogo?");
        System.out.println("1 - sim");
        System.out.println("2 - não");
        
        int quer = entrada.nextInt();
        if(quer == 2){
            break;
            }
        }

        System.out.println("Você acertou! La ele 100x!");

        entrada.close();
    }
}