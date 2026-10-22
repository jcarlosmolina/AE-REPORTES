package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.ReportesProcAlm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportesProcAlmJpaRepository extends JpaRepository<ReportesProcAlm, Long>, ReportesProcAlmJpaRepositoryCustom {
}
