package Dispositivos;
import Utils.ArquivoUtils;

public class Lampada extends DispositivoBase {

    public Lampada(String nome) {
        super(nome);
    }

    @Override
    public void executarFuncao() {
        try {
            for (int i = 1; i <= 5; i++) {
                if (!ligado) break;
                String msg = nome + ": iluminando o ambiente... (" + i + ")";
                System.out.println(msg);
                ArquivoUtils.escrever(msg);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            String msg = nome + ": execução interrompida.";
            System.out.println(msg);
            ArquivoUtils.escrever(msg);
        }
    }
}
