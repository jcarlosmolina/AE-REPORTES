package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Novedad;
import com.keralty.aereportes.persistence.SolicitudNovedad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NovedadJpaRepository extends JpaRepository<Novedad, Long>, NovedadJpaRepositoryCustom {

    List<Novedad> findBySolicitudes(SolicitudNovedad solicitudes);
}
