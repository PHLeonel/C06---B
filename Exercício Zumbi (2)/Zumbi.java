public class Zumbi {
        int vida = 90;
        String nome;

        void mostraVida(){
                System.out.println(nome + " ");
                System.out.print("ele tem " + vida + " de vida");
            }
        
        void correr(){
                System.out.print("zumbi " + nome + " está correndo");
            }

        void transfereVida(Zumbi zumbiAlvo, double quantia){ //passa zumbi como parametro
                vida -= quantia;
                zumbiAlvo.vida += quantia;
        }
}

