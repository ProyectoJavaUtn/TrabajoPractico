package org.example.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
<<<<<<< HEAD
@Data
public class Tecnico {
=======
@Getter
@Setter
public class Tecnico implements Serializable {
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    // private ArrayList<Especialidad> especialidadesTecnico;
<<<<<<< HEAD
    private String nombre, apellido;
    private LocalDateTime fechaDeNacimiento;
    private boolean disponible;
    private List<Incidente> incidentesTecnico;
    private List<Especialidad> especialidades;
    private List<Especialidad> especialidadesTecnico;
}
/*
=======
    private String nombre;
    private String apellido;
    private LocalDateTime fechaDeNacimiento;
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03
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

    public Tecnico() {
        this.especialidades = new ArrayList<Especialidad>();
        this.mensajesNotificaciones = new ArrayList<MensajeNotificacion>();
        this.estimacionesTiempo = new ArrayList<TiempoResolucionPorTecnicoEstimado>();
    }
<<<<<<< HEAD
    public void quitarIncidente (Incidente i){
        this.incidentesTecnico.remove(i);
    }*/

//    public void agregarEspecialidad (Especialidad e){
//        this.especialidadesTecnico.add(e);
//    }
//    public void quitarEspecialidad (Especialidad e){
//        this.especialidadesTecnico.remove(e);
//    }
=======
}
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03
