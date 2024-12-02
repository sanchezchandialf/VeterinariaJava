

import java.util.*;

public class GestionCliente {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Citas> citas= new ArrayList<>();
    //CRUD

    //agregarCliente
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    //BuscarCliente
    public Cliente buscarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getClientId() == id) {
                return cliente;
            }
        }
        return null;
    }

    //EliminarCliente
    public void eliminarCliente(int id) {
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getClientId() == id) {
                iterator.remove();
                break;
            }
        }
    }

    //listar clientes
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
            return;
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    // Remove static and pass GestionCliente instance
    public void formularioCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del cliente:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la direccion del cliente:");
        String direccion = sc.nextLine();
        System.out.println("Ingrese el telefono del cliente:");
        String telefono = sc.nextLine();
        System.out.println("Ingrese el correo del cliente:");
        String correo = sc.nextLine();

        List<Animal> animales = new ArrayList<>();
        Animal mascota = cargarMascota();
        if (mascota != null) {
            animales.add(mascota);
        }

        Cliente cliente = new Cliente(nombre, apellido, direccion, telefono, correo, animales);
        agregarCliente(cliente);
    }
    TypePet type;
    // Changed to return Animal and not static
    public Animal cargarMascota() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la mascota: ");
        String name = sc.nextLine();

        System.out.print("Ingrese el tipo de mascota (Perro, Gato o Loro): ");
        String typeInput = sc.nextLine().toLowerCase(); // Convertir a minúsculas


        try {

            type = TypePet.valueOf(typeInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de mascota inválido. Solo se permiten: Perro, Gato o Loro.");
            return null;
        }

        System.out.print("Ingrese la raza de la mascota: ");
        String breed = sc.nextLine();

        System.out.print("Ingrese la edad de la mascota: ");
        String age = sc.nextLine();

        MedicalHistory medicalHistory = new MedicalHistory();
        Animal mascota = new Animal(name, type, breed, age, medicalHistory);

        System.out.println("Mascota cargada: " + mascota);
        return mascota;
    }


    /**
     * Método que permite agregar una nueva mascota a un cliente dado su ID.
     */
    public void agregarMascotaACliente(int clienteId) {
        Cliente cliente = buscarCliente(clienteId);
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        Animal nuevaMascota = cargarMascota();
        if (nuevaMascota != null) {
            cliente.getAnimalData().add(nuevaMascota);
            System.out.println("Nueva mascota añadida al cliente: " + clienteId);
        } else {
            System.out.println("No se ha podido cargar la mascota.");
        }
    }


    public void mostrarMascotasClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
            return;
        }

        for (Cliente cliente : clientes) {
            System.out.println("Cliente ID: " + cliente.getClientId() + ", Nombre: " + cliente.getNombre() + " " + cliente.getApellido());
            List<Animal> mascotas = cliente.getAnimalData();
            if (mascotas.isEmpty()) {
                System.out.println("  No tiene mascotas registradas.");
            } else {
                for (Animal mascota : mascotas) {
                    System.out.println("  Mascota: " + mascota);
                }
            }
        }
    }


    public void agregarCita(Citas cita) {
        if (cita != null) {
            citas.add(cita);
            System.out.println("Cita agregada exitosamente.");
        } else {
            System.out.println("No se puede agregar una cita nula.");
        }
    }
    
    public void agregarVeterinario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vet:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del vet:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la direccion del vet:");
        String direccion = sc.nextLine();
        System.out.println("Ingrese el telefono del vet:");
        String telefono = sc.nextLine();
        System.out.println("Ingrese el correo del vet:");
        String correo = sc.nextLine();
        Veterinario veterinario = new Veterinario(nombre,apellido,direccion,telefono,correo);
    }
    public void crearCita() {
        Scanner sc = new Scanner(System.in);

        // Solicitar y buscar cliente
        System.out.println("Ingrese el ID del cliente del cual quiere darle cita:");
        listarClientes();
        int clientId = sc.nextInt();
        sc.nextLine(); // Consumir nueva línea

        Cliente cliente = buscarCliente(clientId);
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        // Solicitar y agregar veterinario
        agregarVeterinario();

        // Solicitar fecha de la cita
        System.out.println("Ingrese el día de la cita: ");
        int dia = sc.nextInt();

        System.out.println("Ingrese el mes de la cita: ");
        int mes = sc.nextInt() - 1; // Mes en Java es basado en cero

        System.out.println("Ingrese el año de la cita: ");
        int anio = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes, dia);
        Date fechaCita = calendar.getTime();

        System.out.println("Fecha de la cita: " + fechaCita);

        // Solicitar descripción
        System.out.println("Ingrese la descripción de la cita: ");
        sc.nextLine(); // Consumir nueva línea
        String descripcion = sc.nextLine();

        // Seleccionar estado con validación
        Citas.Estado estado = null;
        while (estado == null) {
            System.out.println("Seleccione el estado de la cita (ingrese el número correspondiente):");
            for (int i = 0; i < Citas.Estado.values().length; i++) {
                System.out.println((i + 1) + ". " + Citas.Estado.values()[i] + " - " +
                        (Citas.Estado.values()[i] == Citas.Estado.ACTIVO ? "Cita activa" : "Cita finalizada"));
            }
            int opcionEstado = sc.nextInt();
            if (opcionEstado >= 1 && opcionEstado <= Citas.Estado.values().length) {
                estado = Citas.Estado.values()[opcionEstado - 1];
            } else {
                System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        }

        // Seleccionar tipo de consulta con validación
        Citas.TipoConsulta tipoConsulta = null;
        while (tipoConsulta == null) {
            System.out.println("Seleccione el tipo de consulta (ingrese el número correspondiente):");
            for (int i = 0; i < Citas.TipoConsulta.values().length; i++) {
                System.out.println((i + 1) + ". " + Citas.TipoConsulta.values()[i] + " - " +
                        (Citas.TipoConsulta.values()[i] == Citas.TipoConsulta.CONSULTA ? "Consulta general" :
                                Citas.TipoConsulta.values()[i] == Citas.TipoConsulta.OPERACION ? "Operación quirúrgica" :
                                        "Revisión rutinaria"));
            }
            int opcionConsulta = sc.nextInt();
            if (opcionConsulta >= 1 && opcionConsulta <= Citas.TipoConsulta.values().length) {
                tipoConsulta = Citas.TipoConsulta.values()[opcionConsulta - 1];
            } else {
                System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        }

        // Solicitar observaciones
        System.out.println("Ingrese observaciones para la cita (si aplica):");
        sc.nextLine(); // Consumir nueva línea
        String observaciones = sc.nextLine();

        // Crear la cita
        Citas cita = new Citas(cliente, null, fechaCita, descripcion, estado, tipoConsulta, observaciones);

        agregarCita(cita);
    }

}