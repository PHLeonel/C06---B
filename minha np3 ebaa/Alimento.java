public class Alimento extends Item{ //subclasse Alimento
    private String validade;

    public Alimento(String validade){
        super(Item); //meu construtor tá engraçado (to tentando lembrar como escreve o construtor considerando a superclasse)
        this.validade = validade;
    }

    @Override
    public void mostraInfo(){
        System.out.println("Nome: " + getNome()); //tentando obter o nome e afins da superclasse Item
        System.out.println("Preço: " + getPreco());
        System.out.println("Estoque: " + getEstoque());
        System.out.println("Validade " + validade);
    }
}
