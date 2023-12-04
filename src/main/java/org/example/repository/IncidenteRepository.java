package org.example.repository;

import org.example.DAO.IncidenteDAO;
import org.example.models.Cliente;
import org.example.models.Incidente;

import java.util.List;

public class IncidenteRepository {
    private IncidenteDAO dao = new IncidenteDAO();

    public void create (Incidente unIncidente){
        dao.create(unIncidente);
    }

    public Incidente findOne (int id) {
        return dao.findOne(id);
    }

    public List<Incidente> findAll(){return dao.findAll();}
}
