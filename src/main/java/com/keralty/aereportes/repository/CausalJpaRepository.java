package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Causal;
import com.keralty.aereportes.persistence.SolicitudNovedad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CausalJpaRepository extends JpaRepository<Causal, Long>, CausalJpaRepositoryCustom {

    List<Causal> findBySolicitudes(SolicitudNovedad solicitudes);
}
