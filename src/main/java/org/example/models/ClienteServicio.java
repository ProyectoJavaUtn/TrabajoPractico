package org.example.models;

import lombok.Data;

import javax.persistence.*;
<<<<<<< HEAD
=======
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03
import java.util.List;

@Entity
@Data
@Table(name = "cliente_servicio")
public class ClienteServicio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;

    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName="id")
    private Cliente clientes;

    @ManyToOne
    @JoinColumn(name="servicio_id", referencedColumnName="id")
    private Servicio servicios;

<<<<<<< HEAD
    @OneToMany(mappedBy = "clienteServicio")
    private List<Incidente> incidente;

}
=======
    @OneToMany(mappedBy = "servicioReportado")
    private List<Incidente> incidentes;

    private LocalDateTime fechaAlta;

    private int pagoMensual;

    public ClienteServicio() {
        this.incidentes = new ArrayList<Incidente>();
    }

>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03

