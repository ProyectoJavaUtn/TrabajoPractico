import java.util.ArrayList;

public class Tecnico {
    static int generadorID = 0;
    private int IDTecnico;
    // private ArrayList<Especialidad> especialidadesTecnico;
    private ArrayList<Incidente> incidentesTecnico;

    public Tecnico (){
        this.IDTecnico = generadorID++;
        this.incidentesTecnico = new ArrayList<Incidente>();
    }

    public void agregarIncidente (Incidente i){
        this.incidentesTecnico.add(i);
    }
    public void quitarIncidente (Incidente i){
        this.incidentesTecnico.remove(i);
    }
    public ArrayList<Incidente> getincidentesTecnico(){
        return incidentesTecnico;
    }
    //Getters y Setters
    public int getIDTecnico() {
        return IDTecnico;
    }
}
