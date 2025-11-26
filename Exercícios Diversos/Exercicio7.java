public class Exercicio7{

    public class Zumbi {
        double vida = 90;
        string nome = "ahahwh";

        public void mostraVida(){
                string coiso;
                coiso = System.out.println(vida);
                return coiso;
            }

            public void transfereVida(zumbiAlvo.vida, double quantia){
                vida -= quantia;
                zumbiAlvo.vida += quantia;
            }
    }

    public class ZumbiAlvo{
        double vida = 90;
        string nome = "ohoy";

        public void mostraVida(){
                string coiso;
                coiso = System.out.println(vida);
                return coiso;
            }

    }

    public static void main(String[] args) {
        Zumbi zumbi;
        ZumbiAlvo zumbialvo;
        double quantia = 50;

        zumbi.transfereVida(zumbialvo.vida, quantia);
        System.out.print("a vida atual do zumbi q foi medico é: ");
        zumbi.mostraVida();
        System.out.print("a vida atual do zumbi q recebeu vida é: ");
        zumbialvo.mostraVida();

    }

}




