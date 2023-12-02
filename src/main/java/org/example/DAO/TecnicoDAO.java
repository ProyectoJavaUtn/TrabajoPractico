package org.example.DAO;

import org.example.models.Tecnico;

public class TecnicoDAO extends AbstractJPADAO<Tecnico>{
    public TecnicoDAO(){
        setClase(Tecnico.class);
    }
}
