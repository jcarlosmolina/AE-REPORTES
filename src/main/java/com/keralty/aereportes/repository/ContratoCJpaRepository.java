package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.ContratoC;
import com.keralty.aereportes.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratoCJpaRepository extends JpaRepository<ContratoC, Long>, ContratoCJpaRepositoryCustom {

    List<ContratoC> findBySolicitud(Solicitud solicitud);
}
