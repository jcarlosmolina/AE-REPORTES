package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.EstadoBeneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoBeneficiarioJpaRepository extends JpaRepository<EstadoBeneficiario, Long>, EstadoBeneficiarioJpaRepositoryCustom {
}
