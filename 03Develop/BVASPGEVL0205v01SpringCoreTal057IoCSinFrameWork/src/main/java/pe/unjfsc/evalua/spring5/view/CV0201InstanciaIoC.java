package pe.unjfsc.evalua.spring5.view;

import pe.bbva.evalua.spring5.logical.CLCreditoProcesarWithInterface;
import pe.bbva.evalua.spring5.logical.impl.CMCreditoProcesarMongo;
import pe.bbva.evalua.spring5.logical.impl.CMCreditoProcesarOracle;

public class CV0201InstanciaIoC {

    public static void main(String[] args) {

        CLCreditoProcesarWithInterface oCreditoMongo = new CLCreditoProcesarWithInterface(new CMCreditoProcesarMongo());
        
        oCreditoMongo.getInsertarSaldo();
        oCreditoMongo.getEliminarSaldo(5);
        
        CLCreditoProcesarWithInterface oCreditOracle = new CLCreditoProcesarWithInterface(new CMCreditoProcesarOracle());
        
        oCreditOracle.getInsertarSaldo();
        oCreditOracle.getEliminarSaldo(5);
    }

}
