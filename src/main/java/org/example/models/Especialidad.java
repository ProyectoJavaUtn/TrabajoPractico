package org.example.models;



import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    @Basic
    private String nombreEspecialidad, descripcion;

}
