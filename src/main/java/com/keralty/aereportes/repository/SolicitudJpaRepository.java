package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudJpaRepository extends JpaRepository<Solicitud, Long>, SolicitudJpaRepositoryCustom {
}
