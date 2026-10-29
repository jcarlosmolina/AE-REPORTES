package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.AnexoNeo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnexoNeoJpaRepository extends JpaRepository<AnexoNeo, Long>, AnexoNeoJpaRepositoryCustom {
}
