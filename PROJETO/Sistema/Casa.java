package Sistema;
import Interfaces.Dispositivo;
import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Dispositivo> dispositivos;

    public Casa() {
        dispositivos = new ArrayList<>();
    }

    public void adicionarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void listarDispositivos() {
        System.out.println("=== Dispositivos na Casa ===");
        for (Dispositivo d : dispositivos) {
            System.out.println("- " + d.getStatus());
        }
    }
}
