package org.example.repository;

import org.example.DAO.ClienteServicioDAO;
import org.example.models.Cliente;
import org.example.models.ClienteServicio;

import java.util.List;

public class ClienteServicioRepository {
    private ClienteServicioDAO dao = new ClienteServicioDAO();

    public void create (ClienteServicio unClienteServicio){
        dao.create(unClienteServicio);
    }

    public ClienteServicio findOne (int id) {
        return dao.findOne(id);
    }

    public List<ClienteServicio> findAll(){return dao.findAll();}
}
