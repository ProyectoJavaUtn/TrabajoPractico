package org.example.models;



import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
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

}