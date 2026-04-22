package com.biomedical.waste.demo.services.admin;

import javax.sql.DataSource;
import org.springframework.stereotype.Service;

@Service
public class CatalogoTipoResiduoAdminService extends AdminTableCrudService {
    public CatalogoTipoResiduoAdminService(DataSource dataSource) {
        super(dataSource, TableSelector.exact("catalogo_tipo_residuo"));
    }
}

