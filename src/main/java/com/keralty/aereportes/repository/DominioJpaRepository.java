package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Dominio;
import com.keralty.aereportes.persistence.ReportesDominio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DominioJpaRepository extends JpaRepository<Dominio, Long>, DominioJpaRepositoryCustom {

    List<Dominio> findByReportesDominio(ReportesDominio reportesDominio);
}
