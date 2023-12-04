package org.example.repository;

import org.example.DAO.MensajeNotificacionDAO;
import org.example.models.Cliente;
import org.example.models.MensajeNotificacion;

import java.util.List;

public class MensajeNotificacionRepository {
    private MensajeNotificacionDAO dao = new MensajeNotificacionDAO();

    public void create (MensajeNotificacion unMensajeNotificacion){
        dao.create(unMensajeNotificacion);
    }

    public MensajeNotificacion findOne (int id) {
        return dao.findOne(id);
    }

    public List<MensajeNotificacion> findAll(){return dao.findAll();}
}
