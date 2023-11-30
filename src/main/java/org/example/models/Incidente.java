package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descripcion;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "cliente_servicio_id")
    private ClienteServicio clienteServicio;

    @ManyToMany(mappedBy = "incidentesTecnico")
    private List<Tecnico> tecnicos;
}
