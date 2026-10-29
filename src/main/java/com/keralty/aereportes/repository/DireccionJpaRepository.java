package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Direccion;
import com.keralty.aereportes.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionJpaRepository extends JpaRepository<Direccion, Long>, DireccionJpaRepositoryCustom {

    List<Direccion> findByContrato(Solicitud contrato);
}
