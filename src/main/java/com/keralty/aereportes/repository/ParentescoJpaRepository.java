package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Parentesco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentescoJpaRepository extends JpaRepository<Parentesco, Long>, ParentescoJpaRepositoryCustom {
}
