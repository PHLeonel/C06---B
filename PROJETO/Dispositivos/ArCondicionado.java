package Dispositivos;
import Utils.ArquivoUtils;

public class ArCondicionado extends DispositivoBase {
    private double temperatura;

    public ArCondicionado(String nome, double temperaturaInicial) {
        super(nome);
        this.temperatura = temperaturaInicial;
    }

    public void ajustarTemperatura(double novaTemperatura) {
        temperatura = novaTemperatura;
        String msg = nome + ": temperatura ajustada para " + temperatura + "°C";
        System.out.println(msg);
        ArquivoUtils.escrever(msg);
    }

    @Override
    public void executarFuncao() {
        try {
            for (int i = 1; i <= 5; i++) {
                if (!ligado) break;
                String msg = nome + ": resfriando o ambiente... (" + i + ")";
                System.out.println(msg);
                ArquivoUtils.escrever(msg);
                Thread.sleep(1200);
            }
        } catch (InterruptedException e) {
            String msg = nome + ": execução interrompida.";
            System.out.println(msg);
            ArquivoUtils.escrever(msg);
        }
    }
}
