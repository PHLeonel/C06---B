import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        Cliente clientes[] = new Cliente[99];
        Conta conta = new Conta(clientes);

        conta.setLimite(1000); //limite de saldo
        conta.setNumero(99); //numero da conta

        System.out.println("Seu saldo é: " + conta.getSaldo()); //mostrando o saldo com o get
        System.out.println("Quanto você quer depositar?"); 
        
        conta.deposita(0); //depositando com a função

        //se eu quisesse mudar o valor do saldo manualmente com o set:
        float valor;
        valor = entrada.nextFloat();
        conta.setSaldo(valor);
        
    }
    
}


//dentro da classe kart:
Motor motor = new motor(); //composição (kart depende do motor, por isso o new)

//dentro da classe sala:
Professor professor; //agregação (sala não depende do professor, tá meio que só referenciando o professor mas não chamando ele)