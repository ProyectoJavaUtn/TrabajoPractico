package org.example.models;



import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    @Basic
    @Column(name = "cuitCliente")
    private int CUITCliente;

    @Basic
    @Column(name = "razonSocialCliente")
    private String razonSocialCliente;

    @ManyToMany(mappedBy = "clientes")
    private List<Servicios> serviciosContratados;

}