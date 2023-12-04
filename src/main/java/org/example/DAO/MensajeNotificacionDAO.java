package org.example.DAO;

import org.example.models.MensajeNotificacion;

public class MensajeNotificacionDAO extends AbstractJPADAO<MensajeNotificacion>{

    public MensajeNotificacionDAO(){
        setClase(MensajeNotificacion.class);
    }
}