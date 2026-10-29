package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Planes;
import com.keralty.aereportes.persistence.SolicitudNovedad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanesJpaRepository extends JpaRepository<Planes, Long>, PlanesJpaRepositoryCustom {

    List<Planes> findBySolicitudesNovedad(SolicitudNovedad solicitudesNovedad);
}
