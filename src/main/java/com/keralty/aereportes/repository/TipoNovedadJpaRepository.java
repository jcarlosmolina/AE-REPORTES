package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.TipoNovedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoNovedadJpaRepository extends JpaRepository<TipoNovedad, Long>, TipoNovedadJpaRepositoryCustom {
}
