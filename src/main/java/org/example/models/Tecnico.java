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

    private ArrayList<Especialidad> especialidadesTecnico;
    private String nombre, apellido;
    private LocalDateTime fechaDeNacimiento;
    private boolean disponible;
    private List<Especialidad> especialidads;
    private List<Incidente> incidentesTecnico;
    private List<Especialidad> especialidades;
    private List<Especialidad> especialidadesTecnicos;
}


