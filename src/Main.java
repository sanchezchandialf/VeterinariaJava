import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionCliente gestionCliente = new GestionCliente();
        System.out.println("Bienvenido a la veterinaria Gerzel");
        System.out.println("SELECCIONE ENTRE LAS DIVERSAS OPCIONES");

        String option;
        do {
            System.out.println("1. Registrar nuevo cliente");
            System.out.println("2. Registrar nueva mascota");
            System.out.println("3. Programar una cita");
            System.out.println("4. Mostrar todos los clientes");
            System.out.println("5. Mostrar todas las mascotas");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            option = sc.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Registrar nuevo cliente");
                    gestionCliente.formularioCliente();
                    break;
                case "2":
                    System.out.println("Registrar nueva mascota");
                    System.out.println("ingrese idcliente");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline

                     gestionCliente.agregarMascotaACliente(id);
                    break;
                case "3":
                    System.out.println("Programar una cita");
                    gestionCliente.crearCita();
                    break;
                case "4":
                    System.out.println("Mostrando todos los clientes");
                    gestionCliente.listarClientes();
                    break;
                case "5":
                    System.out.println("Mostrando todas las mascotas");
                    gestionCliente.mostrarMascotasClientes();
                    break;
                case "6":
                    System.out.println("Saliendo del sistema. Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        } while (!option.equals("6"));
        sc.close();
    }
}