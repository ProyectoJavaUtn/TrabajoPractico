package org.example;

import org.example.config.DBConfig;
import org.example.models.Cliente;
import org.example.models.Especialidad;
import org.example.models.Tecnico;
import org.example.repository.ClienteRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class App
{


    public static void main( String[] args )
    {
        Cliente pepito = new Cliente();
        pepito.setCUITCliente(555);
        pepito.setRazonSocialCliente("aaaaa");
        ClienteRepository cliente = new ClienteRepository();
        cliente.create(pepito);
        Cliente luisito = new Cliente();
        luisito.setCUITCliente(777);
        luisito.setRazonSocialCliente("bbbb");
        cliente.create(luisito);

        //clienteDAO.create(pepito);
       /* clienteDAO.create(luisito);*/
    }

    public static void inicializacion()
    {
        EntityManager em = DBConfig.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        /*Cliente cliente = new Cliente();*/
        tx.commit();

        /*ESPECIALIDADES*/
        Especialidad especialidad1 = new Especialidad("Linux","Sistema Operativo");
        Especialidad especialidad2 = new Especialidad("Windows","Sistema Operativo");
        Especialidad especialidad3 = new Especialidad("MacOs","Sistema Operativo");
        Especialidad especialidad4 = new Especialidad("Jira","Aplicacion");
        Especialidad especialidad5 = new Especialidad("AutoCad","Aplicacion");
        Especialidad especialidad6 = new Especialidad("SAP","Aplicacion");
        Especialidad especialidad7 = new Especialidad("Tango","Aplicacion");

        /*TECNICO*/
        Tecnico tecnico1 = new Tecnico();
        Tecnico tecnico2 = new Tecnico();
        Tecnico tecnico3 = new Tecnico();
        Tecnico tecnico4 = new Tecnico();
        Tecnico tecnico5 = new Tecnico();
    }

}
