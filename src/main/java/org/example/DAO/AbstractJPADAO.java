package org.example.DAO;

import org.example.config.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.Serializable;
import java.util.List;

public abstract class AbstractJPADAO<T extends Serializable> {
    private Class< T > unaClase;
    public void setClase( Class< T > claseASetear ){
        this.unaClase = claseASetear;
    }

    EntityManager entityManager = null;

    public T findOne( int id ){
        entityManager = DBConfig.getEntityManager();
        return entityManager.find( unaClase, id );
    }
    public List< T > findAll(){
        entityManager = DBConfig.getEntityManager();
        return entityManager.createQuery( "from " + unaClase.getName()).getResultList();
    }

    public void create( T entity ){
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist( entity );
        tx.commit();
    }

    public T update( T entity ){
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        T entityMerged = entityManager.merge( entity );
        tx.commit();
        return entityMerged;
    }

    public void delete( T entity ){
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove( entity );
        tx.commit();
    }

}