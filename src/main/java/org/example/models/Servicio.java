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
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    private String nombre;
    private String descripcion;

    @OneToMany (mappedBy = "servicios")
    private List<ClienteServicio> clientes;

    @OneToMany (mappedBy = "servicio")
    private List<Problema> problemas;

    public Servicio() {
        this.clientes = new ArrayList<ClienteServicio>();
        this.problemas = new ArrayList<Problema>();
    }



}