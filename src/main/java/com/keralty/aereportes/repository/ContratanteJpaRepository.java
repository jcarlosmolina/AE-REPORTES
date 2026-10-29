package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Contratante;
import com.keralty.aereportes.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratanteJpaRepository extends JpaRepository<Contratante, Long>, ContratanteJpaRepositoryCustom {

    List<Contratante> findBySolicitud(Solicitud solicitud);
}
