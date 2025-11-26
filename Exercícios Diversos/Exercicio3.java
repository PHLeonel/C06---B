import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a nota1: ");
        int nota1 = entrada.nextInt();
        System.out.print("Entre com a nota2: ");
        int nota2 = entrada.nextInt();

        int total = nota1 + nota2;
        double media = total/2;

        if (media >= 60){
            System.out.print("O aluno passou.\n");
            System.out.print("NPA: " +media);
        }

        else if(media < 60 && media >= 30){
            System.out.print("Vai fazer NP3 sim senhor.\n");
            System.out.print("NPA: " +media);
        }

        else{
            System.out.print("F\n");
            System.out.print("NPA: " +media);
        }

        entrada.close(); 
    }           


}