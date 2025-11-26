package Interfaces;

public interface Dispositivo {
    void ligar();
    void desligar();
    boolean isLigado();
    void executarFuncao();
    String getStatus();
}
