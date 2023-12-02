package org.example.DAO;

import org.example.models.MensajeNotificacion;

public class MensajeNotifiacionDAO extends AbstractJPADAO<MensajeNotificacion>{

    public MensajeNotifiacionDAO(){
        setClase(MensajeNotificacion.class);
    }
}
