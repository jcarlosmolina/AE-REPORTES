package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.PlantillaEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantillaEmailJpaRepository extends JpaRepository<PlantillaEmail, Long>, PlantillaEmailJpaRepositoryCustom {
}
