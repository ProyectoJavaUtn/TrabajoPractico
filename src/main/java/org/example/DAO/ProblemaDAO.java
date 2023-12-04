package org.example.DAO;

import org.example.models.Problema;

public class ProblemaDAO extends AbstractJPADAO<Problema>{

    public ProblemaDAO(){
        setClase(Problema.class);
    }
}