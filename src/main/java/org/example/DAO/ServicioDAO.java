package org.example.DAO;

import org.example.models.Servicio;

public class ServicioDAO extends AbstractJPADAO<Servicio>{

    public ServicioDAO(){
        setClase(Servicio.class);
    }
}