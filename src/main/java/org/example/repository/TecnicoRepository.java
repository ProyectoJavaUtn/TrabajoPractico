package org.example.repository;

import org.example.DAO.TecnicoDAO;
import org.example.models.Tecnico;

public class TecnicoRepository {
    private TecnicoDAO dao = new TecnicoDAO();

    public void create (Tecnico unTecnico){
        dao.create(unTecnico);
    }

    public Tecnico findOne (int id) {
        return dao.findOne(id);
    }
}