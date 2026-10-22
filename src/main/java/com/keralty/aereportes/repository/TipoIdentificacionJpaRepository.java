package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.SolicitudNovedad;
import com.keralty.aereportes.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoIdentificacionJpaRepository extends JpaRepository<TipoIdentificacion, Long>, TipoIdentificacionJpaRepositoryCustom {

    List<TipoIdentificacion> findBySolicitudesNovedad(SolicitudNovedad solicitudesNovedad);
}
