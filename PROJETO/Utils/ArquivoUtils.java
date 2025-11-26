package Utils;
import java.io.*;
import java.time.LocalDateTime;

public class ArquivoUtils {

    private static final String CAMINHO = "Logs/log.txt";

    public static synchronized void escrever(String conteudo) {
        try {
            File file = new File(CAMINHO);
            file.getParentFile().mkdirs();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                String linha = "[" + LocalDateTime.now() + "] " + conteudo;
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static String ler() {
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(CAMINHO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
        } catch (FileNotFoundException e) {
            return "Nenhum log encontrado.";
        } catch (IOException e) {
            return "Erro ao ler o log: " + e.getMessage();
        }
        return conteudo.toString();
    }

    public static void limpar() {
        try {
            File file = new File(CAMINHO);
            file.getParentFile().mkdirs();
            new PrintWriter(file).close();
        } catch (IOException e) {
            System.out.println("Erro ao limpar log: " + e.getMessage());
        }
    }
}
