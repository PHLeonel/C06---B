public class Item implements AplicarDesconto{ //superclasse abstrata Item
    private String nome;
    private double preco;
    private int estoque;

    public Item(String nome, double preco, int estoque){
    this.nome = nome;
    this.preco = preco;
    this.estoque = estoque;
    }

    public boolean verificarEstoque(int quantidade){
        boolean tem = false;
        if(quantidade <= estoque) {
            tem = true;
        }
        return tem;
    }
    public void mostraInfo(){ //método pra subclasses
    }

    @Override
    public double aplicarDesconto(double porcentagem) {
        double desconto = porcentagem*this.preco;
        return desconto;
    }

    public String getNome(){ //getter do nome
        return this.nome;
    }

    public double getPreco(){ //getter do preço
        return this.preco;
    }

    public int getEstoque(){ //getter do estoque
        return this.estoque;
    }

    public void setNome(String nome){ //setter do nome
        this.nome = nome;
    }

    public void setPreco(double nome){ //setter do nome
        this.preco = preco;
    }

    public void setEstoque(int estoque){ //setter do estoque
        this.estoque = estoque;
    }



}
