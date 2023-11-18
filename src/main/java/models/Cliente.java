package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;
    private int CUITCliente;
    private String razonSocialCliente;

    @ManyToMany
    private List<Servicios> serviciosContratados;

    public Cliente() {
    }

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

}