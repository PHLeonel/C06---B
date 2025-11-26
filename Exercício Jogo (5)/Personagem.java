public class Personagem{
    String nome;
    int pontos;
    Arma arma; //no mundo das ideias (vai ser equipado futuramente)
    
    void usarArma(){
        arma.resistencia -= 2;
    }

    void tomarDano(){
        pontos -= 5;
    }
}