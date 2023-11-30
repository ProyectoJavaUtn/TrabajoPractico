package org.example;

import org.example.config.DBConfig;
import org.example.models.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        EntityManager em = DBConfig.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        tx.commit();

    }

}
