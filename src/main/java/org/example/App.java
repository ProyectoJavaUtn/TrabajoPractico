package org.example;

import org.example.DAO.ClienteDAO;
import org.example.config.DBConfig;
import org.example.models.Cliente;
import org.example.models.Incidente;
import org.example.repository.ClienteRepository;
import org.example.repository.IncidenteRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {


    public static void main(String[] args) {
        ClienteRepository clienteRepository = new ClienteRepository();
        IncidenteRepository incidenteRepository = new IncidenteRepository();


        Cliente cliente1 = new Cliente();
        cliente1.setCUITCliente(232686966);
        cliente1.setRazonSocialCliente("APEX");
        clienteRepository.create(cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setCUITCliente(232684966);
        cliente2.setRazonSocialCliente("COTO");
        clienteRepository.create(cliente2);

        Cliente cliente3 = new Cliente();
        cliente3.setCUITCliente(284886966);
        cliente3.setRazonSocialCliente("CARREFOUR");
        clienteRepository.create(cliente3);

        Cliente cliente4 = new Cliente();
        cliente4.setCUITCliente(215646966);
        cliente4.setRazonSocialCliente("DIGITALERS");
        clienteRepository.create(cliente4);

        Cliente cliente5 = new Cliente();
        cliente5.setCUITCliente(232688486);
        cliente5.setRazonSocialCliente("ARCOR S.A.");
        clienteRepository.create(cliente5);

        Cliente cliente6 = new Cliente();
        cliente6.setCUITCliente(284848466);
        cliente6.setRazonSocialCliente("INTEL");
        clienteRepository.create(cliente6);

        Cliente cliente7 = new Cliente();
        cliente7.setCUITCliente(262626966);
        cliente7.setRazonSocialCliente("KENTUCKY");
        clienteRepository.create(cliente7);

        Cliente cliente8 = new Cliente();
        cliente8.setCUITCliente(232757566);
        cliente8.setRazonSocialCliente("SPORTCLUB");
        clienteRepository.create(cliente8);

        Cliente cliente9 = new Cliente();
        cliente9.setCUITCliente(231896966);
        cliente9.setRazonSocialCliente("LAWN TENNIS CLUB");
        clienteRepository.create(cliente9);

        Cliente cliente10 = new Cliente();
        cliente10.setCUITCliente(261625366);
        cliente10.setRazonSocialCliente("CINES HOYTS ");
        clienteRepository.create(cliente10);

        // Crear 10 instancias de Incidente manualmente
        Incidente incidente1 = new Incidente("Incidente 1", LocalDateTime.now(), LocalDate.now().plusDays(1));
        incidenteRepository.create(incidente1);

        Incidente incidente2 = new Incidente("Incidente 2", LocalDateTime.now(), LocalDate.now().plusDays(2));
        incidenteRepository.create(incidente2);

        Incidente incidente3 = new Incidente("Incidente 3", LocalDateTime.now(), LocalDate.now().plusDays(5));
        incidenteRepository.create(incidente3);

        Incidente incidente4 = new Incidente("Incidente 4", LocalDateTime.now(), LocalDate.now().plusDays(5));
        incidenteRepository.create(incidente4);

        Incidente incidente5 = new Incidente("Incidente 5", LocalDateTime.now(), LocalDate.now().plusDays(20));
        incidenteRepository.create(incidente5);

        Incidente incidente6 = new Incidente("Incidente 6", LocalDateTime.now(), LocalDate.now().plusDays(10));
        incidenteRepository.create(incidente6);

        Incidente incidente7 = new Incidente("Incidente 7", LocalDateTime.now(), LocalDate.now().plusDays(10));
        incidenteRepository.create(incidente7);

        Incidente incidente8 = new Incidente("Incidente 8", LocalDateTime.now(), LocalDate.now().plusDays(10));
        incidenteRepository.create(incidente8);

        Incidente incidente9 = new Incidente("Incidente 9", LocalDateTime.now(), LocalDate.now().plusDays(10));
        incidenteRepository.create(incidente9);

        Incidente incidente10 = new Incidente("Incidente 10", LocalDateTime.now(), LocalDate.now().plusDays(2));
        incidenteRepository.create(incidente10);


        Cliente pepito = new Cliente();
        pepito.setCUITCliente(555555555);
        pepito.setRazonSocialCliente("PEPITO");
        ClienteRepository cliente = new ClienteRepository();
        cliente.create(pepito);
        Cliente luisito = new Cliente();
        luisito.setCUITCliente(777777777);
        luisito.setRazonSocialCliente("TIA MARUCA");
        cliente.create(luisito);
    }
}

    /*    Cliente pepito = new Cliente();
        pepito.setCUITCliente(555);
        pepito.setRazonSocialCliente("aaaaa");
        ClienteRepository cliente = new ClienteRepository();
        cliente.create(pepito);
        Cliente luisito = new Cliente();
        luisito.setCUITCliente(777);
        luisito.setRazonSocialCliente("bbbb");
        cliente.create(luisito);

        //clienteDAO.create(pepito);
       *//* clienteDAO.create(luisito);*//*
    }

    *//*public static void inicializacion()
    {
        EntityManager em = DBConfig.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        tx.commit();
    }*/

