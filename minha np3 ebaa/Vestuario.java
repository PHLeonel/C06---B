public class Vestuario extends Item{ //subclasse Vestuario
    private int tamanho;

    public Vestuario(String nome, double preco, int estoque, int tamanho){ //construtor
    this.tamanho = tamanho;
    }

    @Override //método da superclasse Item
    public void mostraInfo(){
        System.out.println(getNome());
    }
}
