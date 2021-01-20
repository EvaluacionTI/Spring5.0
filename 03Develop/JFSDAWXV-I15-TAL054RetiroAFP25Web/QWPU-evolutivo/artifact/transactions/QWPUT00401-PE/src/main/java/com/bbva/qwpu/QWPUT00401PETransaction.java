package com.bbva.qwpu;

import com.bbva.qwpu.dto.evolutivo.common.CEMessagError;
import com.bbva.qwpu.lib.r000.QWPUR000;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;

public class QWPUT00401PETransaction extends AbstractQWPUT00401PETransaction {
    private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT00401PETransaction.class);

    @Override
    public void execute() {
        QWPUR000 qwpuR000 = getServiceLibrary(QWPUR000.class);
        int iIdentificador = Integer.parseInt(String.valueOf(getParameter("id-canal")));
        LOGGER.info("[APX] Intancia eliminar QWPUR000 : {}", qwpuR000);
        LOGGER.info("[APX] iIdentificador a eliminar : {}", iIdentificador);


        int iRpta = qwpuR000.executeDeleteCanal(iIdentificador);
        LOGGER.info("[APX] Identificador de Rpta : {}", iRpta);
        //LOGGER.debug("[APX] iIdentificador Rpta : {}", iIdentificador);

        LOGGER.info("[APX] getAdviceList : {}", this.getAdvice());
        LOGGER.info("[APX] getAdviceList size : {}", this.getAdviceList().size());
        if (this.getAdviceList().isEmpty()){
            this.setTxtMessage("Kill register");
            this.setSeverity(Severity.OK);
            //this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200);
            LOGGER.info("[APX] Kill register : {}", HttpResponseCode.HTTP_CODE_200);
        } else {
            //this.setTxtMessage("Nothing register");
            this.setSeverity(Severity.ENR);
            //this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400);
            LOGGER.info("[APX] Nothing register : {} - {}", CEMessagError.NOT_FOUND_INFORMATION.value(), HttpResponseCode.HTTP_CODE_400);
        }
    }
}
