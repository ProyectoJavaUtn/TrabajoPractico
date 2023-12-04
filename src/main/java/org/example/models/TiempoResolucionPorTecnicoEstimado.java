
package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class TiempoResolucionPorTecnicoEstimado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "tipoProblema_id", referencedColumnName = "id")
    private TipoProblema tipoProblema;

    @ManyToOne
    @JoinColumn(name = "tecnico_id", referencedColumnName = "id")
    private Tecnico tecnico;

    private int horasResolucion;

    public TiempoResolucionPorTecnicoEstimado(int horasResolucion) {
        this.horasResolucion = horasResolucion;
    }
}
