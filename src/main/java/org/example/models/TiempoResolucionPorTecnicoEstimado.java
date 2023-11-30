package org.example.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TiempoResolucionPorTecnicoEstimado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    @ManyToOne
    @JoinColumn(name = "tipoProblema_id", referencedColumnName = "id")
    private TipoProblema tipoProblema;

    @ManyToOne
    @JoinColumn(name = "tecnico_id", referencedColumnName = "id")
    private Tecnico tecnico;

    private int horasResolucion;
}
