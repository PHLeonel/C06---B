package Loja;
import java.util.Scanner;

import CalculaPreco.ProcessarPedido;
import SisteminhaDaLoja.Cliente;
import SisteminhaDaLoja.Computador;
import SisteminhaDaLoja.HardwareBasico;
import SisteminhaDaLoja.MemoriaUSB;
import SisteminhaDaLoja.SistemaOperacional;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quer;
        System.out.println("Quer comprar na minha loja?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        quer = entrada.nextInt();

        if(quer == 1){

        System.out.println("Bem vindo a minha infeliz loja PC Mania!");
        System.out.println("Seu nome?");
        String nome = entrada.nextLine(); //entrada de dados do cliente
        entrada.nextLine();
        
        System.out.println("Seu CPF?");
        String cpf = entrada.nextLine();  //entrada de dados do cliente
        
        Cliente c1 = new Cliente(nome, cpf); //criando o cliente

        System.out.println("Tem matricula?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int temMatricula  = entrada.nextInt();

        if(temMatricula == 1){
            System.out.println("Me informe ela por favor: ");
            c1.setMatricula(entrada.nextLine()); //pra promoção dpois
            entrada.nextLine();
        }

        System.out.println("Agora as promoções disponíveis: ");

        Computador[] computadores = new Computador[9]; //criando array de computadores

        int promocao = 0;
        int in = 0;
        while(true){
            System.out.println("\n---- PROMOÇÕES DISPONÍVEIS ----");
            System.out.println("1 - Promoção Apple");
            System.out.println("2 - Promoção Samsung");
            System.out.println("3 - Promoção Dell");
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha: ");
            promocao = entrada.nextInt();

            if (promocao == 1){
                computadores[in++] = criarPromocao1();
            }   else if (promocao == 2){
                computadores[in++] = criarPromocao2();
            }   else if (promocao == 3){
                computadores[in++] = criarPromocao3();
            }
            else if(promocao == 0){
                break;
            } 
        }

        System.out.println("\nSeu nome: " + c1.getNome()); //MOSTRANDO AS INFO DO CLIENTE
        System.out.println("Seu CPF: " + c1.getCpf());
        
        System.out.println("\nSeu carrinho: \n"); //MOSTRANDO A INFO DOS PCS
        for(int i=0; i<computadores.length; i++){
            if(computadores[i] != null){
                computadores[i].mostraPCConfigs();
            }
        }
        
        //processar o pedido
        ProcessarPedido processar = new ProcessarPedido();
        processar.realizarPedido(c1, computadores);
        }

        else{
            System.out.println("Desapareça :D");
        }


        entrada.close();
    }

        private static Computador criarPromocao1(){ //promoção 1
        Computador pc = new Computador("Apple", 1000); 
        pc.getHardwareBasicos()[0] = new HardwareBasico("Pentium Core i3", 2200);
        pc.getHardwareBasicos()[1] = new HardwareBasico("Memória RAM", 8);
        pc.getHardwareBasicos()[2] = new HardwareBasico("HD", 500);
        pc.setSistema(new SistemaOperacional("macOS Sequoia", 64));
        pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));
        return pc;
    }

    private static Computador criarPromocao2(){ //promoção 2
        Computador pc = new Computador("Samsung", 2000); 
        pc.getHardwareBasicos()[0] = new HardwareBasico("Pentium Core i5", 3370);
        pc.getHardwareBasicos()[1] = new HardwareBasico("Memória RAM", 16);
        pc.getHardwareBasicos()[2] = new HardwareBasico("HD", 1000);
        pc.setSistema(new SistemaOperacional("Windows 8", 64));
        pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
        return pc;
    }

    private static Computador criarPromocao3(){ //promoção 3
        Computador pc = new Computador("Dell", 3000);
        pc.getHardwareBasicos()[0] = new HardwareBasico("Pentium Core i7", 4500);
        pc.getHardwareBasicos()[1] = new HardwareBasico("Memória RAM", 32);
        pc.getHardwareBasicos()[2] = new HardwareBasico("HD", 2000);
        pc.setSistema(new SistemaOperacional("Windows 10", 64));
        pc.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
        return pc;
    }

}
