import java.util.Random;
import java.util.Scanner;

public class Exercicio6{

public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int x = 0;
        int y = 1;

        while(x != y){
            System.out.println("Advinhe o Número de 1 a 10: ");
            y = entrada.nextInt(); //num do usuario
            x = rand.nextInt(10) + 1; //gera um num aleatorio

            if(y>x){
            System.out.println("Teu número é maior do que a maquina gerou.");
            }
            else{ 
                System.out.println("Teu número é menor do que a maquina gerou.");
            }

            System.out.println("Deseja recomeçar o jogo?");
            System.out.println("1 - sim");
            System.out.println("2 - não");
            
            int quer = entrada.nextInt();
            if(quer == 2){
                break;
                }
        }

        if (x == y){
        System.out.println("Acertou");
        }

        entrada.close();
    }

}