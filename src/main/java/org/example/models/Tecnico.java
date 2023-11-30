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

     private ArrayList<Especialidad> especialidadesTecnico;
    private String nombre, apellido;
    private LocalDateTime fechaDeNacimiento;
    private boolean disponible;
    private List<Especialidad> especialidads;
    private List<Incidente> incidentesTecnico;
    private List<Especialidad> especialidadesTecnico;

    @ManyToMany
    @JoinTable( name = "incidente_tecnico",
            joinColumns = @JoinColumn(name = "incidente_id"),
            inverseJoinColumns = @JoinColumn(name = "tecnico_id")
    )
    private Incidente incidente;

}
