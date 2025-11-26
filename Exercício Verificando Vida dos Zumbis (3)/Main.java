public class Main {

    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 150; //ambos com vidas iguais
        z2.vida = 150;
        z1.nome = "Ronaldo";
        z2.nome = "Ronaldo2";

        z1.vida = 100; //manipulando a vida de z1
        z2.vida = 110; //manipulando a vida de z2

        z1.mostraVida();
        z2.mostraVida();

    }
}
