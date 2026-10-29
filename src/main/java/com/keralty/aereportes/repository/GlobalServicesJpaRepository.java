package com.keralty.aereportes.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface GlobalServicesJpaRepository {

    void refreshEntity(Object object);
}
