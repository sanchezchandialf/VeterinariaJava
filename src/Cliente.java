import java.io.Serializable;
import java.util.List;

public class Cliente extends Persona implements Serializable {
    private static int idCounter = 0; // Contador estático para IDs incrementales
    private final int clientId; // Usar final para que no pueda modificarse después de la creación
    private List<Animal> animalData; // Cambiar a minúscula para seguir convenciones Java

    public Cliente(String nombre, String apellido, String direccion, String telefono, String correo, List<Animal> animalData) {
        super(nombre, apellido, direccion, telefono, correo);
        this.clientId = ++idCounter; // Incremento del contador y asignación al clientId
        this.animalData = animalData;
    }

    // Método para obtener el próximo ID sin modificarlo
    public static int getNextId() {
        return idCounter + 1;
    }

    public int getClientId() {
        return clientId;
    }

    public List<Animal> getAnimalData() {
        return animalData;
    }

    public void setAnimalData(List<Animal> animalData) {
        this.animalData = animalData;
    }

    @Override
    public String toString() {
        return String.format(
                "Cliente [ID: %d] - %s %s\n" +
                        "  Dirección: %s\n" +
                        "  Teléfono: %s\n" +
                        "  Correo: %s\n" +
                        "  Mascotas: %d",
                clientId,
                getNombre(),
                getApellido(),
                getDireccion(),
                getTelefono(),
                getCorreo(),
                animalData != null ? animalData.size() : 0
        );
    }


}