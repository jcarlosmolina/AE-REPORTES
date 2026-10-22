package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.oid.ReportesDominioOid;
import com.keralty.aereportes.persistence.ReportesDominio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportesDominioJpaRepository extends JpaRepository<ReportesDominio, ReportesDominioOid>, ReportesDominioJpaRepositoryCustom {
}
