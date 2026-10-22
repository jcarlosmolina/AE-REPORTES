package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.Funcionario;
import com.keralty.aereportes.persistence.ReportesProcAlm;
import com.keralty.aereportes.persistence.Solicitud;
import com.keralty.aereportes.persistence.SolicitudNovedad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioJpaRepository extends JpaRepository<Funcionario, Long>, FuncionarioJpaRepositoryCustom {

    List<Funcionario> findBySolicitudes(Solicitud solicitudes);

    List<Funcionario> findBySolicitudesAfiliacion(Solicitud solicitudesAfiliacion);

    List<Funcionario> findByReportes(ReportesProcAlm reportes);

    List<Funcionario> findBySolicitudesNovedad(SolicitudNovedad solicitudesNovedad);

    List<Funcionario> findBySolNovAifliaciones(SolicitudNovedad solNovAifliaciones);
}
