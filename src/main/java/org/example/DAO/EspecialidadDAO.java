package org.example.DAO;

import org.example.models.Especialidad;

public class EspecialidadDAO extends AbstractJPADAO<Especialidad>{

    public EspecialidadDAO(){
        setClase(Especialidad.class);
    }
}
