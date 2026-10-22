package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.CuestionarioP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuestionarioPJpaRepository extends JpaRepository<CuestionarioP, Long>, CuestionarioPJpaRepositoryCustom {
}
