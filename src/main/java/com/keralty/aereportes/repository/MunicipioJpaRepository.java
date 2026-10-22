package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipioJpaRepository extends JpaRepository<Municipio, Long>, MunicipioJpaRepositoryCustom {
}
