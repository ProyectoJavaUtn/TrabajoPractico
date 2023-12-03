package org.example.models;

import lombok.Data;

import javax.persistence.*;
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

    public TipoProblema(String nombre, String descripcion, int tiempoMaximoDeResolucion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempoMaximoDeResolucion = tiempoMaximoDeResolucion;
    }

    public void addEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }

    public void addTiempoResolucionPorTecnicoEstimado(TiempoResolucionPorTecnicoEstimado tiempoEstimado){
        tiempoEstimado.setTipoProblema(this);
        this.tiempoResolucionPorTecnicoEstimado.add(tiempoEstimado);
    }

    public void addProblema(Problema problema){
        problema.setTipoProblema(this);
        this.problemas.add(problema);
    }
}
