package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "servicios")
    private List<ClienteServicio> clientes;

    @ManyToOne
    @JoinColumn(name = "tipo_problema_id")
    private TipoProblema tipoProblema;
}
