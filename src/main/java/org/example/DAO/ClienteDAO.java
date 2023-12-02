package org.example.DAO;

import org.example.models.Cliente;

import javax.persistence.EntityManager;

public class ClienteDAO extends AbstractJPADAO<Cliente>{

    public ClienteDAO(){
        setClase(Cliente.class);
    }
}
