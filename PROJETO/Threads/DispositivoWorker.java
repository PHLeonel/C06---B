package Threads;
import Interfaces.Dispositivo;
import Utils.ArquivoUtils;

public class DispositivoWorker extends Thread {
    private Dispositivo dispositivo;

    public DispositivoWorker(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void run() {
        dispositivo.ligar();
        ArquivoUtils.escrever(dispositivo.getStatus());
        dispositivo.executarFuncao();
    }
}
