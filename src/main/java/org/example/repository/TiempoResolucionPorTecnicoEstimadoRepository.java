package org.example.repository;

import org.example.DAO.TecnicoDAO;
import org.example.DAO.TiempoResolucionPorTecnicoEstimadoDAO;
import org.example.models.Tecnico;
import org.example.models.TiempoResolucionPorTecnicoEstimado;

public class TiempoResolucionPorTecnicoEstimadoRepository {
    private TiempoResolucionPorTecnicoEstimadoDAO dao = new TiempoResolucionPorTecnicoEstimadoDAO();

    public void create (TiempoResolucionPorTecnicoEstimado unTiempoResolucionPorTecnicoEstimado){
        dao.create(unTiempoResolucionPorTecnicoEstimado);
    }

    public TiempoResolucionPorTecnicoEstimado findOne (int id) {
        return dao.findOne(id);
    }
}
