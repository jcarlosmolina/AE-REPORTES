package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.UsuarioNovedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioNovedadJpaRepository extends JpaRepository<UsuarioNovedad, Long>, UsuarioNovedadJpaRepositoryCustom {
}
