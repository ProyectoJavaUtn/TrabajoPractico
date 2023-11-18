package models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    // private ArrayList<Especialidad> especialidadesTecnico;
    @Basic
    private List<Incidente> incidentesTecnico;
    private List<Especialidad> especialidadesTecnico;

    public Tecnico (){
        this.incidentesTecnico = new ArrayList<Incidente>();
        this.especialidadesTecnico = new ArrayList<Especialidad>();
    }

    public void agregarIncidente (Incidente i){
        this.incidentesTecnico.add(i);
    }
    public void quitarIncidente (Incidente i){
        this.incidentesTecnico.remove(i);
    }

    public void agregarEspecialidad (Especialidad e){
        this.especialidadesTecnico.add(e);
    }
    public void quitarEspecialidad (Especialidad e){
        this.especialidadesTecnico.remove(e);
    }
}
