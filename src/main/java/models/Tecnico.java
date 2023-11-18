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

    public Tecnico (){
        this.incidentesTecnico = new ArrayList<Incidente>();
    }

    public void agregarIncidente (Incidente i){
        this.incidentesTecnico.add(i);
    }
    public void quitarIncidente (Incidente i){
        this.incidentesTecnico.remove(i);
    }
}
