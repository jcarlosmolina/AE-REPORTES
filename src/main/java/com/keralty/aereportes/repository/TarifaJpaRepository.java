package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarifaJpaRepository extends JpaRepository<Tarifa, Long>, TarifaJpaRepositoryCustom {
}
