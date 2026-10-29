package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Persona;
import com.keralty.aereportes.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaJpaRepository extends JpaRepository<Persona, Long>, PersonaJpaRepositoryCustom {

    List<Persona> findBySolicitudesContratante(Solicitud solicitudesContratante);

    List<Persona> findBySolicitudesTitular(Solicitud solicitudesTitular);
}
