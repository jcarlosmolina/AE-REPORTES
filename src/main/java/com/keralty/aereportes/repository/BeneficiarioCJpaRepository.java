package com.keralty.aereportes.repository;

import com.keralty.aereportes.persistence.BeneficiarioC;
import com.keralty.aereportes.persistence.oid.BeneficiarioCOid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiarioCJpaRepository extends JpaRepository<BeneficiarioC, BeneficiarioCOid>, BeneficiarioCJpaRepositoryCustom {
}
