package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.PlantillaReporte;
import com.keralty.aereportes.persistence.ReportesDominio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantillaReporteJpaRepository extends JpaRepository<PlantillaReporte, Long>, PlantillaReporteJpaRepositoryCustom {

    List<PlantillaReporte> findByReportesDominio(ReportesDominio reportesDominio);
}
