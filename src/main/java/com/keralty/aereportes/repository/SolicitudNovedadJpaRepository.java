package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.SolicitudNovedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudNovedadJpaRepository extends JpaRepository<SolicitudNovedad, Long>, SolicitudNovedadJpaRepositoryCustom {
}
