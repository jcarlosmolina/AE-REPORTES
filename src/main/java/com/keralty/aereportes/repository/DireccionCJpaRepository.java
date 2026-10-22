package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.DireccionC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionCJpaRepository extends JpaRepository<DireccionC, Long>, DireccionCJpaRepositoryCustom {
}
