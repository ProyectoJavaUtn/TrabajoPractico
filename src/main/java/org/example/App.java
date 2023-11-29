package org.example;

import org.example.config.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
