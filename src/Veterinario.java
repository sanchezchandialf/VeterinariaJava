import com.sun.source.doctree.VersionTree;

import java.io.Serializable;

public class Veterinario extends  Persona implements Serializable {
    private static int idCounter = 0; // Contador estático para IDs incrementales
    private int idVeterinario;



    public Veterinario() {
    }

    public Veterinario(String nombre, String apellido, String direccion, String telefono, String correo){
        super(nombre, apellido, direccion, telefono, correo);
        this.idVeterinario=++idCounter;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Veterinario.idCounter = idCounter;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "idVeterinario=" + idVeterinario +
                '}';
    }
}
