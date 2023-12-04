
package org.example.repository;

import org.example.DAO.ClienteDAO;
import org.example.models.Cliente;

public class ClienteRepository {

    private ClienteDAO dao = new ClienteDAO();

    public void create (Cliente unCLiente){
        dao.create(unCLiente);
    }

    public Cliente findOne (int id) {
        return dao.findOne(id);
    }


}
