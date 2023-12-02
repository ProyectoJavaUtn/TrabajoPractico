package org.example;

import org.example.DAO.ClienteDAO;
import org.example.config.DBConfig;
import org.example.models.Cliente;
import org.example.repository.ClienteRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class App
{


    public static void main( String[] args )
    {
        Cliente pepito = new Cliente();
        pepito.setCUITCliente(555);
        pepito.setRazonSocialCliente("aaaaa");
        ClienteRepository cliente = new ClienteRepository();
        cliente.create(pepito);
        Cliente luisito = new Cliente();
        luisito.setCUITCliente(777);
        luisito.setRazonSocialCliente("bbbb");
        cliente.create(luisito);

        //clienteDAO.create(pepito);
        /* clienteDAO.create(luisito);*/
    }

    public static void inicializacion()
    {
        EntityManager em = DBConfig.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        tx.commit();
    }





}
  /*  public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("----------- Menú Principal -----------");
            System.out.println("1. Iniciar sesión como Cliente");
            System.out.println("2. Iniciar sesión como Técnico");
            System.out.println("3. Registrar nuevo Cliente");
            System.out.println("4. Registrar nuevo Técnico");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            System.out.println("1. Iniciar sesión como Cliente");
            System.out.println("2. Registrar nuevo Cliente");
            System.out.println("3. Salir");
            switch (opcion) {
                case 1:
                    iniciarSesionCliente();
                    break;
                case 2:
                    iniciarSesionTecnico();
                    break;
                case 3:
                    registrarNuevoCliente();
                    break;
                case 4:
                    registrarNuevoTecnico();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    // Métodos para Cliente

    private static void reportarIncidente() {
        // Lógica para que el Cliente reporte un incidente
        // ...
    }

    private static void verMisIncidentes() {
        // Lógica para que el Cliente vea sus incidentes
        // ...
    }

    private static void verMisNotificaciones() {
        // Lógica para que el Cliente vea sus notificaciones
        // ...
    }

    // Métodos para Técnico
    private static void menuTecnico() {
        int opcionTecnico;

        do {
            System.out.println("----------- Menú Técnico -----------");
            System.out.println("1. Ver Incidentes asignados");
            System.out.println("2. Marcar Incidente como resuelto");
            System.out.println("3. Ver mis Estadísticas");
            System.out.println("4. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            opcionTecnico = scanner.nextInt();

            switch (opcionTecnico) {
                case 1:
                    verIncidentesAsignados();
                    break;
                case 2:
                    marcarIncidenteResuelto();
                    break;
                case 3:
                    verMisEstadisticas();
                    break;
                case 4:
                    System.out.println("Cerrando sesión. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionTecnico != 4);
    }

    private static void verIncidentesAsignados() {
        // Lógica para que el Técnico vea los incidentes asignados
        // ...
    }

    private static void marcarIncidenteResuelto() {
        // Lógica para que el Técnico marque un incidente como resuelto
        // ...
    }

    private static void verMisEstadisticas() {
        // Lógica para que el Técnico vea sus estadísticas
        // ...*/

