package SisteminhaDaLoja;

public class Cliente {
    private String nome;
    private String cpf;
    private String matricula; //adicionei esse aqui
    private Computador computadores[] = new Computador[2]; //pelo menos 2

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(){ //meio q o ProcessarPedido ja faz isso né .-.
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

    public String getMatricula(){ //getter da matricula
        return this.matricula;
    }

    public void setMatricula(String matricula){ //setter da matricula
        this.matricula = matricula;
    }

/*obrigar cliente a comprar 2 ou mais
        if (computadores.length < 2) {
            System.out.println("\nERRO: Tu deve comprar pelo menos 2 computadores seu pobre imundo!");
            return;
        }

*/

}


