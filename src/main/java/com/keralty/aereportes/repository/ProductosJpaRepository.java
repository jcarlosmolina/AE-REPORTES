package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosJpaRepository extends JpaRepository<Productos, Long>, ProductosJpaRepositoryCustom {
}
