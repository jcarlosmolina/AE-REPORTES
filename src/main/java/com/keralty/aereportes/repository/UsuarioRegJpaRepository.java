package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.oid.UsuarioRegOid;
import com.keralty.aereportes.persistence.Solicitud;
import com.keralty.aereportes.persistence.UsuarioReg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRegJpaRepository extends JpaRepository<UsuarioReg, UsuarioRegOid>, UsuarioRegJpaRepositoryCustom {

    List<UsuarioReg> findBySolicitud(Solicitud solicitud);
}
