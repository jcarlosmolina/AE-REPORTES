package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.oid.UsuarioOid;
import com.keralty.aereportes.persistence.Solicitud;
import com.keralty.aereportes.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, UsuarioOid>, UsuarioJpaRepositoryCustom {

    List<Usuario> findBySolicitud(Solicitud solicitud);
}
