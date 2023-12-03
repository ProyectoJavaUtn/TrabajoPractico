package org.example.repository;

import org.example.DAO.ProblemaDAO;
import org.example.DAO.ServicioDAO;
import org.example.models.Problema;
import org.example.models.Servicio;

public class ServicioRepository {
    private ServicioDAO dao = new ServicioDAO();

    public void create (Servicio unServicio){
        dao.create(unServicio);
    }

    public Servicio findOne (int id) {
        return dao.findOne(id);
    }
}
