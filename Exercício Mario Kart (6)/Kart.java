public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    void pular(){
        System.out.println("pulei");
    }

    void soltarTurbo(){
        System.out.println("turbei");
    }

    void fazerDrift(){
        System.out.println("fiz drift");
    }

    public Kart(Motor motor, String nome){ //construtor
        this.motor = motor; //referenciando o motor da classe Kart ("this")
        this.nome = nome;   //referenciando o nome da classe Kart ("nome")
    }


}
