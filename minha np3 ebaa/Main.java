import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Alimento[] item = new Item[10]; //era pra ser a ArrayList mas eu esqueci como escreve ela (o construct desse ta bugado)
        Vestuario[] item2 = new Item[5]; //(construct bugado)


        //setar aqui nome, preço e estoque dos itens

        //ITEM 1:
        item[0].setNome("Banana");
        item[0].setEstoque(10);
        item[0].setPreco(12.00);
        item[0].aplicarDesconto(20/100);

        try {
            carrinho.adicionarItem(item[0], 10);
        }
        catch (Exception EstoqueInsuficienteException){
            System.out.println("Não adicionou o item desejado.");
        }

        // outros itens...

        try {
            carrinho.calcularTotal();
        }

        catch (Exception CarrinhoVazioException){
            System.out.println("Carrinho vazio.");
        }

        //não deu tempo :(
    }
}
