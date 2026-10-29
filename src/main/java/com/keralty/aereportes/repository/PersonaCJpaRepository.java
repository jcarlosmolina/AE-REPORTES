package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.PersonaC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaCJpaRepository extends JpaRepository<PersonaC, Long>, PersonaCJpaRepositoryCustom {
}
