package CalculaPreco;
import SisteminhaDaLoja.Cliente;
import SisteminhaDaLoja.Computador;

public class ProcessarPedido { //helper pra calcular o valor do pedido
    public void realizarPedido(Cliente cliente, Computador[] computadores) {

        float total = 0;

        //somar os preços dos computadores comprados
        for (Computador pc : computadores){
            if (pc != null){
                total += pc.getPreco(); 
            }
        }

        //calcula a soma dos dígitos da matrícula (foi oq eu entendi do exercício desculpa se tiver errado)
        int soma = 0;
        String matricula = cliente.getMatricula(); 
        if (matricula != null){ 
            for (int i = 0; i < matricula.length(); i++){
                char c = matricula.charAt(i);
                if (Character.isDigit(c)){
                    soma += Character.getNumericValue(c);
                }
            }
        }

        float somaConvertida = soma;
        float desconto = somaConvertida / 100.0f; //ta dando 0 sempre (ainda to tentando descobrir pq)

        //aplicar o desconto
        float valorFinal = total - (total * desconto);

        System.out.println("\nPedido enviado...\n");

        System.out.println("Total sem desconto: R$ " + total);
        if (desconto > 0){
            System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        }
        System.out.println("Valor final da compra: R$ " + valorFinal);
    }
}
