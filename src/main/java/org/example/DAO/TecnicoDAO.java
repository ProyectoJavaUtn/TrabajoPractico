package org.example.DAO;

import org.example.models.Incidente;
import org.example.models.Tecnico;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

import static org.example.config.DBConfig.getEntityManager;

public class TecnicoDAO extends AbstractJPADAO<Tecnico> {

    public TecnicoDAO() {
        setClase(Tecnico.class);
    }

    public List<Tecnico> findAvailableTechnicians(Incidente incidente) {
        EntityManager entityManager = getEntityManager();

        // Simplemente, una implementación de ejemplo
        TypedQuery<Tecnico> query = entityManager.createQuery(
                "SELECT t FROM Tecnico t WHERE t.disponible = true", Tecnico.class);

        return query.getResultList();
    }
}
