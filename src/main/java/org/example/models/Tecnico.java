package org.example.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    // private ArrayList<Especialidad> especialidadesTecnico;
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
    /*private List<Incidente> incidentesTecnico;
    private List<Especialidad> especialidadesTecnico;

    @ManyToMany
    @JoinTable( name = "incidente_tecnico",
            joinColumns = @JoinColumn(name = "incidente_id"),
            inverseJoinColumns = @JoinColumn(name = "tecnico_id")
    )
    private Incidente incidente;

    public Tecnico (){
        this.incidentesTecnico = new ArrayList<Incidente>();
//        this.especialidadesTecnico = new ArrayList<Especialidad>();
    }*/

    /*public void agregarIncidente (Incidente i){
        this.incidentesTecnico.add(i);
    }
    public void quitarIncidente (Incidente i){
        this.incidentesTecnico.remove(i);
    }*/

//    public void agregarEspecialidad (Especialidad e){
//        this.especialidadesTecnico.add(e);
//    }
//    public void quitarEspecialidad (Especialidad e){
//        this.especialidadesTecnico.remove(e);
//    }
}
