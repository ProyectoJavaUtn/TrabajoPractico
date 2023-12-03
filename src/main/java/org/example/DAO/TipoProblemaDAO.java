package org.example.DAO;

import org.example.models.TipoProblema;

public class TipoProblemaDAO extends AbstractJPADAO<TipoProblema>{

    public TipoProblemaDAO(){
        setClase(TipoProblema.class);
    }
}