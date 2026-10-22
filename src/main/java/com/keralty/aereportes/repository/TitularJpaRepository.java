package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Solicitud;
import com.keralty.aereportes.persistence.Titular;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitularJpaRepository extends JpaRepository<Titular, Long>, TitularJpaRepositoryCustom {

    List<Titular> findBySolicitud(Solicitud solicitud);
}
