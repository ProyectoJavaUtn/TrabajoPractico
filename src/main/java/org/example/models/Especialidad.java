package org.example.models;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Especialidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Basic
    private String nombreEspecialidad;
    private String descripcion;

}