package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "cliente_servicio")
public class ClienteServicio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName="id")
    private Cliente clientes;

    @ManyToOne
    @JoinColumn(name="servicio_id", referencedColumnName="id")
    private Servicio servicios;

    @OneToMany(mappedBy = "servicioReportado")
    private List<Incidente> incidentes;

    private LocalDateTime fechaAlta;

    private int pagoMensual;

    public ClienteServicio() {
        this.incidentes = new ArrayList<Incidente>();
    }

    public ClienteServicio(LocalDateTime fechaAlta, int pagoMensual) {
        this.fechaAlta = fechaAlta;
        this.pagoMensual = pagoMensual;
        this.incidentes = new ArrayList<Incidente>();
    }

    public void addIncidente(Incidente incidente){
        incidente.setServicioReportado(this);
        this.incidentes.add(incidente);
    }
}