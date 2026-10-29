package com.keralty.aereportes.repository;

import com.keralty.aereportes.global.UserFunctions;
import com.keralty.aereportes.sqlutils.SQLSelect;
import com.keralty.aereportes.sqlutils.TypedQueryBuilder;
import com.keralty.aereportes.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class GlobalServicesJpaRepositoryImpl extends AbstractRepository implements GlobalServicesJpaRepository {

    @Inject
    public GlobalServicesJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
