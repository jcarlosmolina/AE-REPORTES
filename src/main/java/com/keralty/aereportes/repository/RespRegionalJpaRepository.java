package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.RespRegional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespRegionalJpaRepository extends JpaRepository<RespRegional, Long>, RespRegionalJpaRepositoryCustom {
}
