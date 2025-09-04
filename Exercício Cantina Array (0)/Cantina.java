public class Cantina {
    String nome;
    Salgado salgados[] = new Salgado[3];

    void addSalgado(Salgado novoSalgado){
        for(int i = 0; i<salgados.length; i++){
            if(salgados[i] == null){
            salgados[i] = novoSalgado;
            break; //null break
            }
        }
    }

    void mostraInfo(){
        for(int i = 0; i<salgados.length; i++)
            if(salgados != null){
             System.out.println(salgados[i].nome);
            }
    }
}

