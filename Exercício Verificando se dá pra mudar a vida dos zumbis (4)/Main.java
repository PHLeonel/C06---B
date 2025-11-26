public class Main {

    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 100;
        z1.nome = "Ronaldo";
        z2.nome = "Ronaldo2";

        z1.transfereVida(z2, 100);
        System.out.println("Transferencia deu certo?");
        System.out.println(z1.transferiu);

        System.out.println("Vida do Z1: ");
        z1.mostraVida();
        System.out.println("Vida do Z2: ");
        z2.mostraVida();
    }
}
