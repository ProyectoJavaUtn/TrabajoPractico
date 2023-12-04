package org.example;

import org.example.DAO.ClienteDAO;
import org.example.config.DBConfig;
import org.example.controllers.Funciones;
import org.example.models.*;
import org.example.repository.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {


    public static void main(String[] args) {
        ClienteRepository clienteRepository = new ClienteRepository();
        ClienteServicioRepository clienteServicioRepository = new ClienteServicioRepository();
        EspecialidadRepository especialidadRepository = new EspecialidadRepository();
        IncidenteRepository incidenteRepository = new IncidenteRepository();
        MensajeNotificacionRepository mensajeNotificacionRepository = new MensajeNotificacionRepository();
        ProblemaRepository problemaRepository = new ProblemaRepository();
        ServicioRepository servicioRepository = new ServicioRepository();
        TecnicoRepository tecnicoRepository = new TecnicoRepository();
        TiempoResolucionPorTecnicoEstimadoRepository tiempoResolucionRepository = new TiempoResolucionPorTecnicoEstimadoRepository();
        TipoProblemaRepository tipoProblemaRepository = new TipoProblemaRepository();

        // Crear instancias de Cliente
        Cliente cliente1 = new Cliente(123456789, "Cliente A");
        Cliente cliente2 = new Cliente(987654321, "Cliente B");

        // Crear instancias de ClienteServicio
        ClienteServicio clienteServicio1 = new ClienteServicio(LocalDateTime.now(), 100);
        ClienteServicio clienteServicio2 = new ClienteServicio(LocalDateTime.now(), 150);

        // Asociar ClienteServicio con Cliente
        cliente1.addServicio(clienteServicio1);
        cliente2.addServicio(clienteServicio2);

        // Crear instancias de Especialidad
        Especialidad especialidad1 = new Especialidad("Especialidad1", "Descripción1");
        Especialidad especialidad2 = new Especialidad("Especialidad2", "Descripción2");

        // Crear instancias de EstadosIncidente
        EstadosIncidente estado1 = EstadosIncidente.ABIERTO;
        EstadosIncidente estado2 = EstadosIncidente.RESUELTO;

        // Crear instancias de Incidente
        Incidente incidente1 = new Incidente("Incidente1", LocalDateTime.now(), LocalDate.now());
        Incidente incidente2 = new Incidente("Incidente2", LocalDateTime.now(), LocalDate.now());

        // Asociar Incidente con ClienteServicio
        clienteServicio1.addIncidente(incidente1);
        clienteServicio2.addIncidente(incidente2);

        // Crear instancias de MensajeNotificacion
        MensajeNotificacion mensaje1 = new MensajeNotificacion("Titulo1", "Cuerpo1", true);
        MensajeNotificacion mensaje2 = new MensajeNotificacion("Titulo2", "Cuerpo2", false);

        // Asociar MensajeNotificacion con Cliente, Incidente y Tecnico (si tienes la clase)
        mensaje1.setCliente(cliente1);
        mensaje1.setIncidente(incidente1);
        //mensaje1.setTecnico(tecnico1); // Asociar con un técnico si tienes la clase

        mensaje2.setCliente(cliente2);
        mensaje2.setIncidente(incidente2);
        //mensaje2.setTecnico(tecnico2); // Asociar con un técnico si tienes la clase

        // Crear instancias de Problema
        Problema problema1 = new Problema(LocalDateTime.now(), LocalDateTime.now().plusHours(3), 2, "Consideraciones1");
        Problema problema2 = new Problema(LocalDateTime.now(), LocalDateTime.now().plusHours(4), 3, "Consideraciones2");

        // Asociar Problema con TipoProblema, Servicio e Incidente
        TipoProblema tipoProblema1 = new TipoProblema("TipoProblema1", "Descripción1", 5);
        TipoProblema tipoProblema2 = new TipoProblema("TipoProblema2", "Descripción2", 8);

        // Asociar TipoProblema con Especialidad
        tipoProblema1.addEspecialidad(especialidad1);
        tipoProblema2.addEspecialidad(especialidad2);

        // Crear instancias de Servicio
        Servicio servicio1 = new Servicio("Servicio3", "Descripción3");
        Servicio servicio2 = new Servicio("Servicio4", "Descripción4");

        problema1.setTipoProblema(tipoProblema1);
        problema1.setServicio(servicio1);
        problema1.setIncidente(incidente1);

        problema2.setTipoProblema(tipoProblema2);
        problema2.setServicio(servicio2);
        problema2.setIncidente(incidente2);

        // Asociar Servicio con ClienteServicio y Problema
        servicio1.addCliente(clienteServicio1);
        servicio2.addCliente(clienteServicio2);

        servicio1.addProblema(problema1);
        servicio2.addProblema(problema2);

        // Crear instancias de Tecnico
        Tecnico tecnico1 = new Tecnico("Técnico1", "Apellido1", LocalDateTime.now().minusYears(25), true);
        Tecnico tecnico2 = new Tecnico("Técnico2", "Apellido2", LocalDateTime.now().minusYears(30), false);

        // Asociar Tecnico con Especialidad
        tecnico1.addEspecialidad(especialidad1);
        tecnico2.addEspecialidad(especialidad2);

        // Asociar Tecnico con MensajeNotificacion
        tecnico1.addMensajeNotificacion(mensaje1);
        tecnico2.addMensajeNotificacion(mensaje2);

        // Crear instancias de TiempoResolucionPorTecnicoEstimado
        TiempoResolucionPorTecnicoEstimado tiempoEstimado1 = new TiempoResolucionPorTecnicoEstimado(4);
        TiempoResolucionPorTecnicoEstimado tiempoEstimado2 = new TiempoResolucionPorTecnicoEstimado(6);

        // Asociar TiempoResolucionPorTecnicoEstimado con TipoProblema y Tecnico
        tiempoEstimado1.setTipoProblema(tipoProblema1);
        tiempoEstimado1.setTecnico(tecnico1);

        tiempoEstimado2.setTipoProblema(tipoProblema2);
        tiempoEstimado2.setTecnico(tecnico2);

        // Guardar en los repositorios

        especialidadRepository.create(especialidad1);
        especialidadRepository.create(especialidad2);

        tecnicoRepository.create(tecnico1);
        tecnicoRepository.create(tecnico2);

        tipoProblemaRepository.create(tipoProblema1);
        tipoProblemaRepository.create(tipoProblema2);

        tiempoResolucionRepository.create(tiempoEstimado1);
        tiempoResolucionRepository.create(tiempoEstimado2);

        clienteRepository.create(cliente1);
        clienteRepository.create(cliente2);

        servicioRepository.create(servicio1);
        servicioRepository.create(servicio2);

        clienteServicioRepository.create(clienteServicio1);
        clienteServicioRepository.create(clienteServicio2);

        incidenteRepository.create(incidente1);
        incidenteRepository.create(incidente2);

        problemaRepository.create(problema1);
        problemaRepository.create(problema2);

        mensajeNotificacionRepository.create(mensaje1);
        mensajeNotificacionRepository.create(mensaje2);


        Funciones funcionTecnico = new Funciones();

        // Llama a la función y muestra el resultado
        Tecnico tecnicoConMenorTiempo = funcionTecnico.findTecnicoConMenorTiempoResolucion();

        if (tecnicoConMenorTiempo != null) {
            System.out.println("El técnico que hizo el menor tiempo para resolver es: " + tecnicoConMenorTiempo.getNombre());
        } else {
            System.out.println("No se encontró ningún técnico con tiempos de resolución.");
        }
    }
}


