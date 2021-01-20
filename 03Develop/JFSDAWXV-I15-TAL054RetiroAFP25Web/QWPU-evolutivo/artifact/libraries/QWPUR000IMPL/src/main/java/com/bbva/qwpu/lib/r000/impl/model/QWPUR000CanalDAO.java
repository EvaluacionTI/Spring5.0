package com.bbva.qwpu.lib.r000.impl.model;

import com.bbva.qwpu.dto.evolutivo.CECanalDTO;
import java.util.List;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QWPUR000CanalDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger("QWPUR000CanalDAO");

    private static List<CECanalDTO> oaListaCanales;
    {
        LOGGER.info("[APX] Start Load data");
        oaListaCanales = new ArrayList<CECanalDTO>();
        oaListaCanales.add(new CECanalDTO(1, "BI", "BNET", "BNET UX PERSONAS", true, "30/05/2018"));
        oaListaCanales.add(new CECanalDTO(2, "BM", "GNET", "BANCA MOVIL - GLOMO PRIVADO", true, "17/07/2018"));
        oaListaCanales.add(new CECanalDTO(3, "BP", "BPM", "BPM SOLUTION", true, "28/08/2018"));
        oaListaCanales.add(new CECanalDTO(4, "CC", "IVR", "IVR CONTAC CENTER", true, "12/09/2015"));
        oaListaCanales.add(new CECanalDTO(5, "GL", "GNET", "BANCA MOVIL - GLOMO PUBLICO", true, "13/08/2018"));
        oaListaCanales.add(new CECanalDTO(6, "HA", "HAREC", "HAREC", true, "17/02/2015"));
        oaListaCanales.add(new CECanalDTO(7, "HR", "ASTA", "HUASCARAN", false, "04/05/2017"));
        oaListaCanales.add(new CECanalDTO(8, "J2", "0026", "TRANSACCIONES TRUCHA", true, "08/02/2016"));
        oaListaCanales.add(new CECanalDTO(9, "MW", "BNET", "WALLET PRIVADO", false, "3/05/2016"));
        oaListaCanales.add(new CECanalDTO(10, "PH", "PH", "PRUEBAS HOST/APX", true, "01/03/2018"));
        oaListaCanales.add(new CECanalDTO(11, "AD", "ASUNAD", "ADUANAS - SUNAD", true, "30/05/2018"));
        oaListaCanales.add(new CECanalDTO(12, "AL", "FULLCARGA", "AGENTES FULLCARGA ALIGNET", true, "17/07/2018"));
        oaListaCanales.add(new CECanalDTO(13, "AM", "MULTIFACIL", "AGENTES MULTIFACIL HERMES", true, "28/08/2018"));
        oaListaCanales.add(new CECanalDTO(14, "BD", "BIODAC", "BIOMETRIA DACTILAR", true, "12/09/2015"));
        oaListaCanales.add(new CECanalDTO(15, "BE", "PROBE", "PROY. BILLETERA ELECTRONI", true, "13/08/2018"));
        oaListaCanales.add(new CECanalDTO(16, "CT", "IVR C", "IVR CONTACT CENTER PRIVAD", true, "17/02/2015"));
        oaListaCanales.add(new CECanalDTO(17, "FV", "FUVEX", "FUVEX", false, "04/05/2017"));
        oaListaCanales.add(new CECanalDTO(18, "LS", "LEASING", "ADM. DE BIENES DE LEASING", true, "08/02/2016"));
        oaListaCanales.add(new CECanalDTO(19, "MN", "MPLUS", "MONITOR PLUS", false, "3/05/2016"));
        oaListaCanales.add(new CECanalDTO(20, "PC", "COMERCI", "PLATAFORMA COMERCIAL", true, "01/03/2018"));
        LOGGER.info("[APX] Start Load data : {}", oaListaCanales.size());
    }

    public List<CECanalDTO> listAllCanalLocal() {
        LOGGER.info("[APX] Size List : {} ", oaListaCanales.size());
        return oaListaCanales;
    }

    public CECanalDTO listByIdCanal(int piIdentificador){
        CECanalDTO oCEAuxCanal = new CECanalDTO();

        for (CECanalDTO ceCanalDTO : oaListaCanales) {
            if (ceCanalDTO.getId() == piIdentificador){
                oCEAuxCanal.setId(ceCanalDTO.getId());
                oCEAuxCanal.setCodigo(ceCanalDTO.getCodigo());
                oCEAuxCanal.setAbreviatura(ceCanalDTO.getAbreviatura());
                oCEAuxCanal.setDescripcion(ceCanalDTO.getDescripcion());
                oCEAuxCanal.setSiNoActivo(ceCanalDTO.getSiNoActivo());
                oCEAuxCanal.setFechaRegistro(ceCanalDTO.getFechaRegistro());
                break;
            }
        }
        LOGGER.info("[APX] CECanalDTO : {} ", oCEAuxCanal.toString());
        return oCEAuxCanal;
    }

    public int saveCanalLocal(CECanalDTO poCECanal) {
        LOGGER.info("[APX] New CECanalDTO : {} ", poCECanal.toString());
        int lRpta = 1;
        for (CECanalDTO ceCanalDTO : oaListaCanales) {
            if (ceCanalDTO.getId() == poCECanal.getId()){
                LOGGER.info("[APX] Canal Existe id : {} ", poCECanal.getId());
                lRpta = 0;
                break;
            }
        }
        if (lRpta==1){
            oaListaCanales.add(poCECanal);
            lRpta = oaListaCanales.size();
        }
        return lRpta;
    }

    public int updateCanalLocal(CECanalDTO poCECanal){
        LOGGER.info("[APX] Udate CECanalDTO : {} ", poCECanal.toString());
        int lRpta = 0;

        for (CECanalDTO ceCanalDTO : oaListaCanales) {
            LOGGER.info("[APX] Canal reader : {} ", ceCanalDTO.toString());
            if (ceCanalDTO.getId() == poCECanal.getId()){
                LOGGER.info("[APX] Canal Existe id : {} ", poCECanal.getId());
                ceCanalDTO.setCodigo(poCECanal.getCodigo());
                ceCanalDTO.setAbreviatura(poCECanal.getAbreviatura());
                ceCanalDTO.setDescripcion(poCECanal.getDescripcion());
                ceCanalDTO.setSiNoActivo(poCECanal.getSiNoActivo());
                ceCanalDTO.setFechaRegistro(poCECanal.getFechaRegistro());
                lRpta = poCECanal.getId();
                oaListaCanales.remove(ceCanalDTO);
                oaListaCanales.add(poCECanal);
                break;
            }
        }
        LOGGER.info("[APX] Rpta canal update : {} ", lRpta);
        return lRpta;
    }

    public int deleteCanalLocal(int piId){
        LOGGER.info("[APX] Delete id : {} ", piId);
        int lRpta = 0;
        for (CECanalDTO ceCanalDTO : oaListaCanales) {
            LOGGER.info("[APX] Canal reader : {} ", ceCanalDTO.toString());
            if (piId == ceCanalDTO.getId()){
                LOGGER.info("[APX] Canal Existe id : {} ", piId);
                lRpta = ceCanalDTO.getId();
                oaListaCanales.remove(ceCanalDTO);
                break;
            }
        }
        LOGGER.info("[APX] Rpta Canal delete : {} ", lRpta);
        return lRpta;
    }
}
