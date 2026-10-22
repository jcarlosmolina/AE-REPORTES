package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Aesolicitudes;
import com.keralty.aereportes.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AesolicitudesJpaRepository extends JpaRepository<Aesolicitudes, Long>, AesolicitudesJpaRepositoryCustom {

    List<Aesolicitudes> findBySolicitud(Solicitud solicitud);
}
