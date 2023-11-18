package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;
    // private ArrayList<Especialidad> especialidadesTecnico;
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
