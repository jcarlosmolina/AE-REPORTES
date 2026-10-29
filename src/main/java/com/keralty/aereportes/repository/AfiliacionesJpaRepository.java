package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Afiliaciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AfiliacionesJpaRepository extends JpaRepository<Afiliaciones, Long>, AfiliacionesJpaRepositoryCustom {
}
