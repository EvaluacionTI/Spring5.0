package pe.unjfsc.daw.spring5.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliadoEntrada;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliadoSalida;

public class CLSaldoAfiliadoProcessor implements ItemProcessor<CESaldoAfiliadoEntrada, CESaldoAfiliadoSalida>{

	private static final Logger MOLOG = LoggerFactory.getLogger(CLSaldoAfiliadoProcessor.class);
	private CESaldoAfiliadoSalida oCESalida;
	
	public CESaldoAfiliadoSalida process(CESaldoAfiliadoEntrada poItemCompra) throws Exception {
		MOLOG.info("[EVL] =====[ Start process ]=====");
		MOLOG.info("[EVL] Data received input : {} ", poItemCompra.toString());

		MOLOG.info("[EVL] CESaldoAfiliadoSalida : {} ", oCESalida);
		
		oCESalida.setCodigo(poItemCompra.getCodigo());
		oCESalida.setCodigoAfiliado(poItemCompra.getCodigoAfiliado());
		oCESalida.setSaldoCIC(poItemCompra.getSaldoCIC());
		MOLOG.info("[EVL] New CESaldoAfiliadoSalida : {} ", oCESalida.toString());

		return oCESalida;
	}

	public void setoCESalida(CESaldoAfiliadoSalida oCESalida) {
		this.oCESalida = oCESalida;
	}
}
