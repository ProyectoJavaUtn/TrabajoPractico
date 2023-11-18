package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long id;
    private LocalDateTime fechaIncidente;
    private LocalDate fechaResolucionIncidente;
    @ManyToOne
    private Cliente clienteIncidente;
    @ManyToMany
    private Servicios servicioIncidente;
    private EstadosIncidente estado;
    private String feedbackIncidente;

    public Incidente() {
    }

    public Incidente(Cliente clienteIncidente, Servicios servicioIncidente) {

        fechaIncidente= LocalDateTime.now();
        estado = EstadosIncidente.PENDIENTE;
        this.clienteIncidente = clienteIncidente;
        this.servicioIncidente = servicioIncidente;
    }
}
