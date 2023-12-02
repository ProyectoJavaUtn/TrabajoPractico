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

<<<<<<< HEAD

    @OneToMany (mappedBy = "servicios")
    private List<ClienteServicio> clientes;

    @OneToMany (mappedBy = "tipo_problema")
    private List<TipoProblema> tipoProblemaList;
=======
    @OneToMany (mappedBy = "servicios")
    private List<ClienteServicio> clientes;

    @OneToMany (mappedBy = "servicio")
    private List<Problema> problemas;

    public Servicio() {
        this.clientes = new ArrayList<ClienteServicio>();
        this.problemas = new ArrayList<Problema>();
    }


>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03

}