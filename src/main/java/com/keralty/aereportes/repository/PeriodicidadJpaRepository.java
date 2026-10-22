package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Periodicidad;
import com.keralty.aereportes.persistence.Solicitud;
import com.keralty.aereportes.persistence.SolicitudNovedad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodicidadJpaRepository extends JpaRepository<Periodicidad, Long>, PeriodicidadJpaRepositoryCustom {

    List<Periodicidad> findBySolicitudes(Solicitud solicitudes);

    List<Periodicidad> findBySolicitudesNovedad(SolicitudNovedad solicitudesNovedad);

    List<Periodicidad> findBySolicitudesNovedadNueva(SolicitudNovedad solicitudesNovedadNueva);
}
