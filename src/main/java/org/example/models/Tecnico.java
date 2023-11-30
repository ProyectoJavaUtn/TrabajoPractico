package org.example.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;


    private String nombre;
    private String apellido;
    private LocalDateTime fechaDeNacimiento;
    @ManyToMany
    @JoinTable(name = "TECNICO_ESPECIALIDAD",
            joinColumns = @JoinColumn(name = "especialidad_id"),
            inverseJoinColumns = @JoinColumn(name = "tecnico_id"))
    private List<Especialidad> especialidades;
    private boolean disponible;
    @OneToMany(mappedBy = "tecnico")
    private List<MensajeNotificacion> mensajesNotificaciones;
    @OneToMany(mappedBy = "tecnico")
    private List<TiempoResolucionPorTecnicoEstimado> estimacionesTiempo;

}


