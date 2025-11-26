package Dispositivos;
import Interfaces.Dispositivo;

public abstract class DispositivoBase implements Dispositivo {
    protected String nome;
    protected boolean ligado;

    public DispositivoBase(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println(nome + " foi ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public boolean isLigado() {
        return ligado;
    }

    @Override
    public String getStatus() {
        return nome + (ligado ? " está ligado" : " está desligado");
    }
}
