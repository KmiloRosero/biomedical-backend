package com.biomedical.waste.demo.services.admin;

import javax.sql.DataSource;
import org.springframework.stereotype.Service;

@Service
public class CatalogoTipoInstalacionesAdminService extends AdminTableCrudService {
    public CatalogoTipoInstalacionesAdminService(DataSource dataSource) {
        super(dataSource, TableSelector.prefix("catalogo_tipo_instalac"));
    }
}

