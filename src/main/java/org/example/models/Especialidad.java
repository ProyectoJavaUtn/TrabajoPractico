package org.example.models;

import lombok.Data;
import org.example.config.DBConfig;

import javax.persistence.*;
<<<<<<< HEAD
import java.util.List;
=======
import java.io.Serializable;
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03

@Entity
@Data
public class Especialidad implements Serializable {

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
