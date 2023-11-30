package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    private String nombre;
    private String descripcion;

    /*private List<TipoProblema> tipoProblemaList;*/

    private List<ClienteServicio> clientes;

    /*@ManyToMany
    @JoinTable(
            name="cliente_servicio",
            joinColumns = @JoinColumn(name= "servicio_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    List<Cliente> clientes;*/



}