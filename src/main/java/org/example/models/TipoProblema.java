package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class TipoProblema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    private String nombre, descripcion;

    private int tiempoMaximoDeResolucion;

    @OneToMany (mappedBy = "tipoProblema")
    private List <TipoProblemaEspecialidad> tipoProblemaEspecialidadList;
}
