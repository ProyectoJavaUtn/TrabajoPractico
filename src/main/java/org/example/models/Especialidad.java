
package org.example.models;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Especialidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    private String nombreEspecialidad;
    private String descripcion;

    public Especialidad(String nombreEspecialidad, String descripcion) {
        this.nombreEspecialidad = nombreEspecialidad;
        this.descripcion = descripcion;
    }
}

