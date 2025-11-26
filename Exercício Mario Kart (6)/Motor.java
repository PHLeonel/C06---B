public class Motor {
    String cilindradas;
    float velocidadeMaxima;

    void mostraInfo() {
        if (velocidadeMaxima <= 150) {
            if (!cilindradas.equals("50") && 
                !cilindradas.equals("100") && 
                !cilindradas.equals("150")) {
                System.out.println(cilindradas + " cilindradas");
                System.out.println(velocidadeMaxima + " de velocidade máxima");
            }
        } else {
            System.out.println("explodiu");
        }
    }
}
