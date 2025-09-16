package SisteminhaDaLoja;

public class Cliente {
    private String nome;
    private String cpf;
    private int matricula; //adicionei esse aqui
    private Computador computadores[] = new Computador[9]; 

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(){ //calculando o total da compra
        float total = 0;
        for (Computador c : computadores){
            if (c != null){
                total += c.getPreco();
            }
        }
        return total;
    }
    
    public String getNome(){ //getter do nome
        return this.nome;
    }

    public String getCpf(){ //getter do cpf
        return this.cpf;
    }

    public int getMatricula(){ //getter da matricula
        return this.matricula;
    }

    public void setMatricula(int matricula){ //setter da matricula
        this.matricula = matricula;
    }

    public void setComputadores(Computador[] computadores){ //setter dos computadores no cliente
    this.computadores = computadores;
}


}


