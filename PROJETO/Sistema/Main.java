package Sistema;
import Dispositivos.*;
import Threads.DispositivoWorker;
import Utils.ArquivoUtils;

public class Main {
    public static void main(String[] args) {

        ArquivoUtils.limpar(); //limpa o log

        Casa casa = new Casa();

        //nomes de cômodos
        String[] comodos = {"Sala", "Cozinha", "Quarto", "Banheiro", "Escritório"};

        //cria 5 lâmpadas e 5 ar condicionados
        for (int i = 0; i < 5; i++) {
            casa.adicionarDispositivo(new Lampada("Lâmpada (" + (i + 1) + ") - " + comodos[i]));
            casa.adicionarDispositivo(new ArCondicionado("Ar-Condicionado (" + (i + 1) + ") - " + comodos[i], 22.0 + i));
        }

        casa.listarDispositivos();

        //cria uma thread pra cada dispositivo
        Thread[] threads = new Thread[casa.getDispositivos().size()];
        int index = 0;
        for (var d : casa.getDispositivos()) {
            threads[index++] = new DispositivoWorker(d);
        }

        //inicia todas
        for (Thread t : threads) t.start();

        //espera todas terminarem
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String msgFinal = "Todos os dispositivos finalizaram suas tarefas.";
        System.out.println("\n" + msgFinal);
        ArquivoUtils.escrever(msgFinal);

        System.out.println("\n=== CONTEÚDO DO LOG ===");
        System.out.println(ArquivoUtils.ler());
    }
}
