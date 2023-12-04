package org.example.repository;

import org.example.DAO.TecnicoDAO;
import org.example.models.Cliente;
import org.example.models.Tecnico;

import java.util.List;

public class TecnicoRepository {
    private TecnicoDAO dao = new TecnicoDAO();

    public void create (Tecnico unTecnico){
        dao.create(unTecnico);
    }

    public Tecnico findOne (int id) {
        return dao.findOne(id);
    }

    public List<Tecnico> findAll(){return dao.findAll();}
}
