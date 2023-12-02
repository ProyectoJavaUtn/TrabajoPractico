package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03
import java.util.List;

@Entity
@Data
<<<<<<< HEAD
@Table(name = "INCIDENTE")
public class Incidente {
=======
@Table(name = "incidente")
public class Incidente implements Serializable {
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;
    private String titulo;
    private LocalDateTime fechaIncidente;
    private LocalDate fechaResolucionIncidente;
<<<<<<< HEAD
    private Servicio servicioIncidente;

    @Enumerated(EnumType.STRING)
    private EstadosIncidente estado;
    private String feedbackIncidente;
=======
    @OneToMany (mappedBy = "incidente")
    private List<MensajeNotificacion> mensajesNotificacion;
    @ManyToOne
    @JoinColumn(name = "servicio_id", referencedColumnName = "servicio_id")
    private ClienteServicio servicioReportado;

    public Incidente() {
        this.mensajesNotificacion = new ArrayList<MensajeNotificacion>();
    }
>>>>>>> ee9d27b84a3cce146df2fee1ac0375d20c1f0b03

    @ManyToOne
    @JoinColumn(name = "cliente_servicio_id")
    private ClienteServicio clienteServicio;
    @OneToMany (mappedBy = "incidente")
    private List<Problema> problemas;

}
