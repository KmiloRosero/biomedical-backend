package com.biomedical.waste.demo.services.admin;

import javax.sql.DataSource;
import org.springframework.stereotype.Service;

@Service
public class VGeneracionMensualAdminService extends AdminTableCrudService {
    public VGeneracionMensualAdminService(DataSource dataSource) {
        super(dataSource, TableSelector.exact("v_generacion_mensual"));
    }
}

