package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.TipoIVA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoIVAJpaRepository extends JpaRepository<TipoIVA, Long>, TipoIVAJpaRepositoryCustom {
}
