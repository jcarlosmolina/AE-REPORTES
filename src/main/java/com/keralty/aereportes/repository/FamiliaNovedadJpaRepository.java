package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.FamiliaNovedad;
import com.keralty.aereportes.persistence.SolicitudNovedad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamiliaNovedadJpaRepository extends JpaRepository<FamiliaNovedad, Long>, FamiliaNovedadJpaRepositoryCustom {

    List<FamiliaNovedad> findBySolicitud(SolicitudNovedad solicitud);
}
