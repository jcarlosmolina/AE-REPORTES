package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalJpaRepository extends JpaRepository<Sucursal, Long>, SucursalJpaRepositoryCustom {
}
