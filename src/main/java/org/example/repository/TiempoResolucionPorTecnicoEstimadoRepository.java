package org.example.repository;

import org.example.DAO.TiempoResolucionPorTecnicoEstimadoDAO;
import org.example.models.Cliente;
import org.example.models.TiempoResolucionPorTecnicoEstimado;

import java.util.List;

public class TiempoResolucionPorTecnicoEstimadoRepository {
    private TiempoResolucionPorTecnicoEstimadoDAO dao = new TiempoResolucionPorTecnicoEstimadoDAO();

    public void create (TiempoResolucionPorTecnicoEstimado unTiempoResolucionPorTecnicoEstimado){
        dao.create(unTiempoResolucionPorTecnicoEstimado);
    }

    public TiempoResolucionPorTecnicoEstimado findOne (int id) {
        return dao.findOne(id);
    }

    public List<TiempoResolucionPorTecnicoEstimado> findAll(){return dao.findAll();}
}
