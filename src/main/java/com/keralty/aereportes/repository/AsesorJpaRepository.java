package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Asesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsesorJpaRepository extends JpaRepository<Asesor, Long>, AsesorJpaRepositoryCustom {
}
