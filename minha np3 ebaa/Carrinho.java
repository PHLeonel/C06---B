import com.sun.security.jgss.GSSUtil;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Carrinho { //agregação com a classe Item
    private Item[] item; //agregação (esqueci como escreve o ArrayList nos métodos)
    //ArrayList carrinhoArray = new ArrayList(Item);
    public void adicionarItem(Item item, int quantidade){

            this.item = new Item[quantidade]; //se o retorno do verificarEstoque for falso
            System.out.println("Estoque insuficiente");
    }
    public double calcularTotal(){
        double total = 0;
            for (int i = 0; i < item.length; i++) {
                total += this.item[i].getPreco();

            System.out.println("Carrinho tá vazio");

        return total;
    }

    public void exibirItens(){
        for(int i = 0; i<item.length; i++){
            System.out.println(item[i]); //mostrando cada item no carrinho
        }
    }
}
