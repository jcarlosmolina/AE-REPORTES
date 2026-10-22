package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.CausaExclusion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CausaExclusionJpaRepository extends JpaRepository<CausaExclusion, Long>, CausaExclusionJpaRepositoryCustom {
}
