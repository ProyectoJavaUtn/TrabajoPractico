package org.example.models;

import lombok.Data;

import javax.persistence.*;
<<<<<<< HEAD
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
=======
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class TipoProblema implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    private String nombre;
    private String descripcion;
    private int tiempoMaximoDeResolucion;
    @ManyToMany
    @JoinTable(name = "TIPOPROBLEMA_ESPECIALIDAD",
            joinColumns = @JoinColumn(name = "especialidad_id"),
            inverseJoinColumns = @JoinColumn(name = "tipoProblema_id"))
    private List<Especialidad> especialidades;
    @OneToMany(mappedBy = "tipoProblema")
    private List<TiempoResolucionPorTecnicoEstimado> tiempoResolucionPorTecnicoEstimado;
    @OneToMany(mappedBy = "tipoProblema")
    private List<Problema> problemas;

    public TipoProblema() {
        this.especialidades = new ArrayList<Especialidad>();
        this.tiempoResolucionPorTecnicoEstimado = new ArrayList<TiempoResolucionPorTecnicoEstimado>();
        this.problemas = new ArrayList<Problema>();
    }
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03
}
