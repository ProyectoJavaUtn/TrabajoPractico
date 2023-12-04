package org.example.repository;

import org.example.DAO.ProblemaDAO;
import org.example.models.Cliente;
import org.example.models.Problema;

import java.util.List;

public class ProblemaRepository {
    private ProblemaDAO dao = new ProblemaDAO();

    public void create (Problema unProblema){
        dao.create(unProblema);
    }

    public Problema findOne (int id) {
        return dao.findOne(id);
    }

    public List<Problema> findAll(){return dao.findAll();}
}
