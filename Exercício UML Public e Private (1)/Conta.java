public class Conta {
    
    private int numero;
    private float saldo;
    private float limite;

    Cliente clientes[];

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void sacar(float quantia){
        if(quantia > saldo){
        saldo -= quantia;
        }
    }

    public void deposita(float quantia){
        if((quantia <= limite) || ((saldo + quantia) <= limite))
        saldo += quantia;
    }

//construtor
    Conta(Cliente[] clientes){
        this.clientes = clientes; 
    }
}
