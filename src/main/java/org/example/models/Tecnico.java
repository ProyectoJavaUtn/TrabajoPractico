package org.example.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Tecnico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // private ArrayList<Especialidad> especialidadesTecnico;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaDeNacimiento;
    @ManyToMany
    @JoinTable(name = "TECNICO_ESPECIALIDAD",
            joinColumns = @JoinColumn(name = "tecnico_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private List<Especialidad> especialidades;
    private boolean disponible;
    @OneToMany(mappedBy = "tecnico")
    private List<MensajeNotificacion> mensajesNotificaciones;
    @OneToMany(mappedBy = "tecnico")
    private List<TiempoResolucionPorTecnicoEstimado> estimacionesTiempo;

    public Tecnico() {
        this.especialidades = new ArrayList<Especialidad>();
        this.mensajesNotificaciones = new ArrayList<MensajeNotificacion>();
        this.estimacionesTiempo = new ArrayList<TiempoResolucionPorTecnicoEstimado>();
    }

    public Tecnico(String nombre, String apellido, LocalDateTime fechaDeNacimiento, boolean disponible) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.disponible = disponible;
        this.especialidades = new ArrayList<Especialidad>();
        this.mensajesNotificaciones = new ArrayList<MensajeNotificacion>();
        this.estimacionesTiempo = new ArrayList<TiempoResolucionPorTecnicoEstimado>();
    }

    public void addEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }

    public void addMensajeNotificacion(MensajeNotificacion mensaje){
        mensaje.setTecnico(this);
        this.mensajesNotificaciones.add(mensaje);
    }

    public void addTiempoResolucionPorTecnicoEstimado(TiempoResolucionPorTecnicoEstimado tiempoEstimado){
        tiempoEstimado.setTecnico(this);
        this.estimacionesTiempo.add(tiempoEstimado);
    }
}