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

<<<<<<< HEAD
=======
    @OneToMany (mappedBy = "cliente")
    private List<MensajeNotificacion> mensajesNotificaciones;

    public Cliente() {
        this.servicios = new ArrayList<ClienteServicio>();
        this.mensajesNotificaciones = new ArrayList<MensajeNotificacion>();
    }
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03

}