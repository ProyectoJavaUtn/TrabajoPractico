package org.example.models;



import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@Entity
@Data
@Table(name = "cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    @Column(name = "cuit_cliente")
    private int CUITCliente;

    @Column(name = "razon_social_cliente")
    private String razonSocialCliente;

    @OneToMany (mappedBy = "clientes")
    private List<ClienteServicio> servicios;

    @OneToMany (mappedBy = "cliente")
    private List<MensajeNotificacion> mensajesNotificaciones;

    public Cliente() {
        this.servicios = new ArrayList<ClienteServicio>();
        this.mensajesNotificaciones = new ArrayList<MensajeNotificacion>();
    }
   /* private static void menuCliente() {
        int opcionCliente;
        opcion = scanner.nextInt();
        System.out.println("1. Iniciar sesión como Cliente");
        System.out.println("2. Registrar nuevo Cliente");
        System.out.println("3. Salir");
        do {
            System.out.println("----------- Menú Cliente -----------");
            System.out.println("1. Ver Servicios contratados");
            System.out.println("2. Reportar incidente");
            System.out.println("3. Ver mis Notificaciones");
            System.out.println("4. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            Cuando un cliente llama, la mesa de ayuda le solicita los datos para identificarlo (razón social,
                    CUIT) y los ingresa en el sistema para que el mismo le muestre los servicios que el cliente
            tiene contratados.
            El operador (de la mesa de ayuda) solicita que le informen por cuál de esos servicios desea
            reportar un incidente, junto con una descripción del problema y el tipo del problema.
            Al ingresar el incidente, el sistema devuelve un listado de técnicos disponibles para resolver el
            problema. El operador selecciona uno de los técnicos disponibles y el sistema le informa el
            tiempo estimado de resolución. Luego, informa al cliente que el incidente ha sido ingresado y
            la fecha posible de resolución.
            opcionCliente = scanner.nextInt();

            switch (opcionCliente) {
                case 1:
                    reportarIncidente();
                    break;
                case 2:
                    verMisIncidentes();
                    break;
                case 3:
                    verMisNotificaciones();
                    break;
                case 4:
                    System.out.println("Cerrando sesión. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionCliente != 4);
    }*/

}