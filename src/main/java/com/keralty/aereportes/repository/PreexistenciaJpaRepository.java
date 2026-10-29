package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.oid.PreexistenciaOid;
import com.keralty.aereportes.persistence.Preexistencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreexistenciaJpaRepository extends JpaRepository<Preexistencia, PreexistenciaOid>, PreexistenciaJpaRepositoryCustom {
}
