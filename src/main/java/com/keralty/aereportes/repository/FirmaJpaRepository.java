package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Firma;
import com.keralty.aereportes.persistence.Solicitud;
import com.keralty.aereportes.persistence.SolicitudNovedad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirmaJpaRepository extends JpaRepository<Firma, Long>, FirmaJpaRepositoryCustom {

    List<Firma> findBySolicitudNovedad(SolicitudNovedad solicitudNovedad);

    List<Firma> findBySolicitud(Solicitud solicitud);

    List<Firma> findBySolicitudSegunda(Solicitud solicitudSegunda);

    List<Firma> findBySolicitudContratante(Solicitud solicitudContratante);
}
