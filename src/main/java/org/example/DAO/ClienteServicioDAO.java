package org.example.DAO;

import org.example.models.ClienteServicio;

public class ClienteServicioDAO extends AbstractJPADAO<ClienteServicio>{

    public ClienteServicioDAO(){
        setClase(ClienteServicio.class);
    }
}