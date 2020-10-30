package pe.unjfsc.daw.spring5.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliadoEntrada;

public class CLSaldoAfiliadoMapper implements FieldSetMapper<CESaldoAfiliadoEntrada> {
	private static final Logger MOLOG = LoggerFactory.getLogger(CLSaldoAfiliadoMapper.class);
	
	private CESaldoAfiliadoEntrada oCEEntrada;
	
	public CESaldoAfiliadoEntrada mapFieldSet(FieldSet poFieldSet) throws BindException {
		MOLOG.info("[EVL] =====[ Start mapFieldSet ]=====");
		MOLOG.info("[EVL] read record : {} ", poFieldSet.toString());
		MOLOG.info("[EVL] CESaldoAfiliadoEntrada : {} ", oCEEntrada.toString());
		
		//CESaldoAfiliadoEntrada oEntrada = new CESaldoAfiliadoEntrada();
		oCEEntrada.setCodigo(poFieldSet.readString("CODIGO"));
		oCEEntrada.setCodigoAfiliado(poFieldSet.readString("APELLIDOS"));
		oCEEntrada.setSaldoCIC(poFieldSet.readDouble("SALDO"));
	
		MOLOG.info("[EVL] Mapper to CESaldoAfiliadoEntrada : {}", oCEEntrada.toString());

		return oCEEntrada;
	}

	public void setoCEEntrada(CESaldoAfiliadoEntrada oCEEntrada) {
		this.oCEEntrada = oCEEntrada;
	}

}
