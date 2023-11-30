package org.example.models;

import lombok.Data;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "cliente_servicio")
public class ClienteServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    private LocalDateTime fechaAlta;

    private int pagoMensual;

    @OneToMany(mappedBy = "clienteServicio")
    private List<Incidente> incidente;

    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName="id")
    private Cliente clientes;

    @ManyToOne
    @JoinColumn(name="servicio_id", referencedColumnName="id")
    private Servicio servicios;

    @OneToMany(mappedBy = "servicioReportado")
    private List<Incidente> incidentes;
}
