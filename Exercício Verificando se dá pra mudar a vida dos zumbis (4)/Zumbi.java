public class Zumbi {
        int vida;
        String nome;
        Boolean transferiu = false;

        void mostraVida(){

                System.out.println(nome + " tem " + vida + " de vida");
            }
        
        void correr(){
                System.out.print("zumbi " + nome + " está correndo");
            }

        void transfereVida(Zumbi zumbiAlvo, double quantia){ //passa zumbi como parametro
                if(vida >= quantia){
                        vida -= quantia;
                        zumbiAlvo.vida += quantia;
                        transferiu = true;
                }

                else{
                        transferiu = false;
                }
        }
}

