package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Regional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionalJpaRepository extends JpaRepository<Regional, Long>, RegionalJpaRepositoryCustom {
}
