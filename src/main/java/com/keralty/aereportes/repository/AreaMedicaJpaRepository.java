package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.AreaMedica;
import com.keralty.aereportes.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaMedicaJpaRepository extends JpaRepository<AreaMedica, Long>, AreaMedicaJpaRepositoryCustom {

    List<AreaMedica> findBySolicitudesArMe(Solicitud solicitudesArMe);
}
