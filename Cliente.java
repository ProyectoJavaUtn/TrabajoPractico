import java.util.ArrayList;
public class Cliente {

    private int CUITCliente;
    private String razonSocialCliente;
    private ArrayList <Servicios> serviciosContratados;

    public Cliente (int CUITCliente, String razonSocialCliente){
        this.serviciosContratados = new ArrayList<Servicios>();
        this.CUITCliente = CUITCliente;
        this.razonSocialCliente = razonSocialCliente;
    }

    public void agregarServicio (Servicios s){
        this.serviciosContratados.add(s);
    }
    public void quitarServicio (Servicios s){
        this.serviciosContratados.remove(s);
    }
    public ArrayList<Servicios> getServiciosContratados(){
        return serviciosContratados;
    }

}
