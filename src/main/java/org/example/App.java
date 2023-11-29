package org.example;

import org.example.config.DBConfig;
import org.example.models.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
=======
import org.example.models.Especialidad;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        tx.commit();

=======
        Especialidad especialidad = new Especialidad("asdas", "asdasd");
    }
}
