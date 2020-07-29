package pe.bbva.evalua.spring5.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

public class CUProcesSaldoAfiliado implements ItemProcessor<CESaldoAfiliadoCustom, CESaldoAfiliadoCustom>{

	private static final Logger LOG = LoggerFactory.getLogger(CUProcesSaldoAfiliado.class);
	
	public CESaldoAfiliadoCustom process(CESaldoAfiliadoCustom poSaldoInput) throws Exception {
		LOG.info("[EVL] =====[ Start process ]=====");
		LOG.info("[EVL] Data received input : {} ", poSaldoInput.toString());
		
		CESaldoAfiliadoCustom oSaldoOutput = new CESaldoAfiliadoCustom();
		LOG.info("[EVL] Instance CESaldoAfiliadoCustom Output : {} ", oSaldoOutput.toString());
		
		oSaldoOutput.setId(poSaldoInput.getId());
		oSaldoOutput.setCodigoAfiliado(poSaldoInput.getCodigoAfiliado());
		oSaldoOutput.setSaldoCIC(poSaldoInput.getSaldoCIC());

		LOG.info("[EVL] New CESaldoAfiliadoCustom : {} ", oSaldoOutput.toString());

		return oSaldoOutput;
	}
}
