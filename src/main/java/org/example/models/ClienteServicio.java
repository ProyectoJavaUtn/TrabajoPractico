package org.example.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cliente_servicio")
public class ClienteServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName="id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="servicio_id", referencedColumnName="id")
    private Servicio servicio;


}
