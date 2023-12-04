
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
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    public Cliente(int CUITCliente, String razonSocialCliente) {
        this.CUITCliente = CUITCliente;
        this.razonSocialCliente = razonSocialCliente;
        this.servicios = new ArrayList<ClienteServicio>();
        this.mensajesNotificaciones = new ArrayList<MensajeNotificacion>();
    }

    public void addServicio(ClienteServicio servicio){
        servicio.setClientes(this);
        this.servicios.add(servicio);
    }

    public void addMensajeNotificacion(MensajeNotificacion mensajeNotificacion){
        mensajeNotificacion.setCliente(this);
        this.mensajesNotificaciones.add(mensajeNotificacion);
    }

}
