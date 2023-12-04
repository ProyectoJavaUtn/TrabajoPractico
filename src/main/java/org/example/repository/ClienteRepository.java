package org.example.repository;

import org.example.DAO.ClienteDAO;
import org.example.models.Cliente;

import java.util.List;

public class ClienteRepository {

    private ClienteDAO dao = new ClienteDAO();

    public void create (Cliente unCLiente){
        dao.create(unCLiente);
    }

    public Cliente findOne (int id) {
        return dao.findOne(id);
    }

    public List<Cliente> findAll(){return dao.findAll();}

}
