import java.time.LocalDate;
import java.time.LocalDateTime;

public class Incidente {
    static int generadorID = 0;
    private int IDIncidente;
    private LocalDateTime fechaIncidente;
    private LocalDate fechaResolucionIncidente;
    private Cliente clienteIncidente;
    private Servicios servicioIncidente;
    private EstadosIncidente estado;
    private String feedbackIncidente;

    public Incidente(Cliente clienteIncidente, Servicios servicioIncidente) {
        this.IDIncidente = generadorID++;
        fechaIncidente= LocalDateTime.now();
        estado = EstadosIncidente.PENDIENTE;
        this.clienteIncidente = clienteIncidente;
        this.servicioIncidente = servicioIncidente;
    }

    //Getters y Setters
    public int getIDIncidente() {
        return IDIncidente;
    }
    public LocalDate getFechaResolucionIncidente() {
        return fechaResolucionIncidente;
    }

    public void setFechaResolucionIncidente(LocalDate fechaResolucionIncidente) {
        this.fechaResolucionIncidente = fechaResolucionIncidente;
    }

    public EstadosIncidente getEstado() {
        return estado;
    }

    public void setEstado(EstadosIncidente estado) {
        this.estado = estado;
    }
    public String getFeedbackIncidente() {
        return feedbackIncidente;
    }

    public void setFeedbackIncidente(String feedbackIncidente) {
        this.feedbackIncidente = feedbackIncidente;
    }
}
