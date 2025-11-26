//A MAIN NÃO PRECISA EXISTIR

/* 
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Motor motor = new Motor();
        Piloto piloto = new Piloto();
        Kart kart = new Kart(motor, "rogerio"); //já inicializa com o nome
        kart.piloto = piloto;
        System.out.println("Qual o nome do piloto?");
        piloto.nome = entrada.nextLine();

        kart.motor.velocidadeMaxima = 500;
        kart.motor.cilindradas = "coiso.cc";
        kart.motor.mostraInfo();

        //Poder
        System.out.println("Quer soltar poder?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int soltapoder = entrada.nextInt();
        if(soltapoder == 1){
            piloto.soltaSuperPoder();
        }
        else{
            System.out.println("Não soltou poder");
        }

        //Pular
        System.out.println("Quer pular com o kart?");
        int querpular = entrada.nextInt();
        if(querpular == 1){
            piloto.soltaSuperPoder();
        }
        else{
            System.out.println("Não pulou");
        }


    }
    
    //agregar piloto com kart
    //compor motor com kart
}

*/