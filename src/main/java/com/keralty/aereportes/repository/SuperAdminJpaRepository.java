package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperAdminJpaRepository extends JpaRepository<SuperAdmin, Long>, SuperAdminJpaRepositoryCustom {
}
