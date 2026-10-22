package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.AnexoMat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnexoMatJpaRepository extends JpaRepository<AnexoMat, Long>, AnexoMatJpaRepositoryCustom {
}
