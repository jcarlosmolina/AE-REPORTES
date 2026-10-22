package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.GrupoAsociado;
import com.keralty.aereportes.persistence.Solicitud;
import com.keralty.aereportes.persistence.SolicitudNovedad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrupoAsociadoJpaRepository extends JpaRepository<GrupoAsociado, Long>, GrupoAsociadoJpaRepositoryCustom {

    List<GrupoAsociado> findBySolicitudes(Solicitud solicitudes);

    List<GrupoAsociado> findBySolicitudesNovedad(SolicitudNovedad solicitudesNovedad);
}
