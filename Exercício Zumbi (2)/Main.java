public class Main {

    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        zumbi.vida = 100;
        zumbi.nome = "roberto";

        zumbi.correr();
        zumbi.mostraVida();

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 100;

        z1.transfereVida(z2, 100);
        z1.mostraVida();

    }
}
