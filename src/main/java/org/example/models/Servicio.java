package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "servicio")
public class Servicio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "servicios")
    private List<ClienteServicio> clientes;

    @OneToMany(mappedBy = "servicio")
    private List<Problema> problemas;

    public Servicio() {
        this.clientes = new ArrayList<ClienteServicio>();
        this.problemas = new ArrayList<Problema>();
    }

    public Servicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clientes = new ArrayList<ClienteServicio>();
        this.problemas = new ArrayList<Problema>();
    }

    public void addCliente(ClienteServicio cliente){
        cliente.setServicios(this);
        this.clientes.add(cliente);
    }

    public void addProblema(Problema problema){
        problema.setServicio(this);
        this.problemas.add(problema);
    }
}