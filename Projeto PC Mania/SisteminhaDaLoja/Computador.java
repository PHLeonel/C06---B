package SisteminhaDaLoja;
public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional sistema;
    private HardwareBasico hardwares[]; //"*" tava no coiso do exercício
    private MemoriaUSB memoriaUSB; //pode ou não ter memoria USB

    public Computador(String marca, float preco){ //construtor
        this.marca = marca;
        this.preco = preco;
        this.hardwares = new HardwareBasico[3];
    }

    public void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + this.preco);
        System.out.println("Hardware Básico:\n");
        if (hardwares != null){
            for (int i = 0; i < hardwares.length; i++){
                if (hardwares[i] != null){
                    System.out.println("- " + hardwares[i].getNome() + " - " + hardwares[i].getCapacidade()); //tenho q coisar aqui pra diferenciar o que é cada tipo de hardware
                }
                System.out.println();
            }
        }
        if (sistema != null){
            System.out.println("Sistema Operacional: " + sistema.getNome());
        }   System.out.println("Tipo: " + sistema.getTipo() + "bits");

        if (memoriaUSB != null){
            System.out.println("Memória USB: " + memoriaUSB.getNome());
            System.out.println("Capacidade: " + memoriaUSB.getCapacidade());
        }

        System.out.println("--------------------");
    }

    public void addMemoriaUSB(MemoriaUSB usb){
    this.memoriaUSB = usb;
    }
    
    public float getPreco(){
        return this.preco;
    }

    public HardwareBasico[] getHardwareBasicos(){ //getter do hardware basico
        return hardwares;
    }

    //setter pro sistema operacional
    public void setSistema(SistemaOperacional sistema){
        this.sistema = sistema;
    }
}
   
