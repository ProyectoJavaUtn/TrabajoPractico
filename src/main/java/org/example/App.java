package org.example;

import org.example.DAO.ClienteDAO;
import org.example.config.DBConfig;
import org.example.models.Cliente;
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

    /*public static void inicializacion()
    {
        EntityManager em = DBConfig.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        tx.commit();
    }*/





}
