package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoJpaRepository extends JpaRepository<Departamento, Long>, DepartamentoJpaRepositoryCustom {
}
