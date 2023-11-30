package org.example.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TIPO_PROBLEMA_ESPECIALIDAD")
@Data
public class TipoProblemaEspecialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    @ManyToOne
    @JoinColumn(name = "tipo_problema_id")
    private TipoProblema tipoProblema;

    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad;
}