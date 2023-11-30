package org.example.models;

import lombok.Data;
import org.example.config.DBConfig;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    @Basic
    private String nombreEspecialidad;
    private String descripcion;

    @OneToMany (mappedBy = "especialidad")
    private List<TipoProblemaEspecialidad> tipoProblemaEspecialidadList;


    public Especialidad(String nombreEspecialidad, String descripcion) {
        this.nombreEspecialidad= nombreEspecialidad;
        this.descripcion= descripcion;
    }
}
