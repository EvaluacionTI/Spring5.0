package com.bbva.qwpu.lib.r100.impl.mapper;

import com.bbva.qwpu.dto.employed.CEEmployedDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Date;
import java.util.Map;

public class EmployedMapper {
    private static final Logger LOG = LoggerFactory.getLogger("mapperEmployed");

    public static CEEmployedDTO mapper(Map<String, Object> input){
        CEEmployedDTO oCEEmployed = new CEEmployedDTO();

        LOG.info("[APX] Map   : {}", input.size());
        LOG.info("[APX] Instancia : {}", oCEEmployed.toString());

        oCEEmployed.setId((String)input.get("ID"));
        oCEEmployed.setFirstName((String)input.get("FIRST_NAME"));
        oCEEmployed.setLastName((String)input.get("LAST_NAME"));
        oCEEmployed.setEmail((String)input.get("EMAIL"));
        oCEEmployed.setAge((Integer) input.get("AGE"));
        oCEEmployed.setLimitCredit((Double)input.get("LIMIT_CREDIT"));
        oCEEmployed.setSiNoActivo((boolean)input.get("SN_ACTIVO"));
        oCEEmployed.setFechaRegistro((Date)input.get("DATE_REGISTER"));

        LOG.info("[APX] Cliente mapeado : {}", oCEEmployed.toString());

        return oCEEmployed;
    }
}
