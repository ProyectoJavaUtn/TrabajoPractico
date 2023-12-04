package org.example.DAO;

import org.example.models.Incidente;

public class IncidenteDAO extends AbstractJPADAO<Incidente>{
    public IncidenteDAO(){
        setClase(Incidente.class);
    }
}