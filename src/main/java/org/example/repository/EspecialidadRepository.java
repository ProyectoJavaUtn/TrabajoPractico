package org.example.repository;

import org.example.DAO.EspecialidadDAO;
import org.example.models.Especialidad;

public class EspecialidadRepository {
    private EspecialidadDAO dao = new EspecialidadDAO();

    public void create (Especialidad unEspecialidad){
        dao.create(unEspecialidad);
    }
    public Especialidad findOne (int id) {
        return dao.findOne(id);
    }
}