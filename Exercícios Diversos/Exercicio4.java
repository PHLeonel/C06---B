import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numAlunos = entrada.nextInt();

        switch (numAlunos){
            /*case 10:
                System.out.println("Aula na sala I-16");
            break;
            */

            case 20:
            System.out.println("Aula na sala I-16");
            break;

            case 30:
            System.out.println("Aula na sala I-22");
            break;

            default:
            System.out.println("Sala não encontrada");
            break;

        }


        entrada.close();
    }

}