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

    @Column(name = "cuit_cliente")
    private int CUITCliente;

    @Column(name = "razon_social_cliente")
    private String razonSocialCliente;

    @OneToMany (mappedBy = "cliente")
    private List<Servicio> serviciosContratados;

    public Cliente(int CUITCliente, String razonSocialCliente, List<Servicio> serviciosContratados) {
        this.CUITCliente = CUITCliente;
        this.razonSocialCliente = razonSocialCliente;
        this.serviciosContratados = serviciosContratados;
    }
}