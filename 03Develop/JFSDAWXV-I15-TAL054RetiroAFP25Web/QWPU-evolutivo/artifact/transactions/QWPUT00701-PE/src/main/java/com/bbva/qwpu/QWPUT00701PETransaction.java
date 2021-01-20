package com.bbva.qwpu;

import com.bbva.qwpu.lib.r000.QWPUR000;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;

public class QWPUT00701PETransaction extends AbstractQWPUT00701PETransaction {
    private static final Logger LOGGER = LoggerFactory.getLogger("QWPUT00701PETransaction");

    @Override
    public void execute() {
		QWPUR000 qwpuR000 = getServiceLibrary(QWPUR000.class);
        LOGGER.info("[APX] Start execute...");
        LOGGER.info("[APX] Intancia QWPUR000 : {}", qwpuR000);
        String sRpta = qwpuR000.executeEco();

        if (this.getAdviceList().isEmpty()) {
            LOGGER.info("[APX][TX] Set Response Ok");
            setDataeco(sRpta);
            this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
        } else {
            LOGGER.info("[APX][TX] Set Response Error");
            this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
        }
    }
}
