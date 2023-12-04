package org.example.repository;

import org.example.DAO.TipoProblemaDAO;
import org.example.models.Cliente;
import org.example.models.TipoProblema;

import java.util.List;

public class TipoProblemaRepository {
    private TipoProblemaDAO dao = new TipoProblemaDAO();

    public void create (TipoProblema unTipoProblema){
        dao.create(unTipoProblema);
    }

    public TipoProblema findOne (int id) {
        return dao.findOne(id);
    }

    public List<TipoProblema> findAll(){return dao.findAll();}
}
