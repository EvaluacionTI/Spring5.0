package pe.etg.bbva.evalua.spring5.entity;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.etg.bbva.evalua.spring5.entity.CE0101v01TipoCanal;

@RunWith(Parameterized.class)
public class CE0101v01TipoCanalTest {
	private static Logger MOLOG = LoggerFactory.getLogger(CE0101v01TipoCanalTest.class);
	
	private int idTipoCanal;
	private String abreviatura;
	private String descripcion;
	private Date fechaRegistro;
	private CE0101v01TipoCanal oCERptaTipoCanal;
	
	public CE0101v01TipoCanalTest (int piIdTipoCanal, String psAbreviatura, String psDescripcion, Date pdFechaRegistro) {
		this.idTipoCanal = piIdTipoCanal;
		this.abreviatura = psAbreviatura;
		this.descripcion = psDescripcion;
		this.fechaRegistro = pdFechaRegistro;
	}

	@Before
	public void initialize() {
		oCERptaTipoCanal = new CE0101v01TipoCanal();
		MOLOG.info("[EVL] Instancia generada : {} ", oCERptaTipoCanal );
	}
	
	@Parameters
	public static Collection<Object[]> inputData() {
		return Arrays.asList(new Object[][] {
			{1,"PC","PIC", new Date(2018,8,31) },
			{2,"GL","GLOMO PRIVADO", new Date("07/09/2018") },
			{3,"GM","GLOMO PÚBLICO", new Date("14/09/2018") },
			{4,"PH","FRONT APX", new Date("21/09/2018")},
			{5,"TM","ATM PÚBLICO",new Date("28/09/2018")}
		});
	}
	
	@Test
	public void testCETipoCanalToString() {
		MOLOG.info("[EVL] Start method");
	
		String sExpectedResult;
		
		oCERptaTipoCanal.setIdTipoCanal(this.idTipoCanal);
		oCERptaTipoCanal.setAbreviatura(this.abreviatura);
		oCERptaTipoCanal.setDescripcion(this.descripcion);
		oCERptaTipoCanal.setFechaRegistro(this.fechaRegistro);
		
		MOLOG.info("[EVL] Dato del canal : {}", oCERptaTipoCanal );	
		
		sExpectedResult = new StringBuilder()
				.append("CE0101v01TipoCanal [idTipoCanal=").append(oCERptaTipoCanal.getIdTipoCanal())
				.append(", abreviatura=").append(oCERptaTipoCanal.getAbreviatura())
				.append(", descripcion=").append(oCERptaTipoCanal.getDescripcion())
				.append(", fechaRegistro=").append(oCERptaTipoCanal.getFechaRegistro())
				.append("]").toString();
		
		MOLOG.info("[EVL] Dato Esperado : {}", sExpectedResult );		
		
		assertEquals(oCERptaTipoCanal.toString(), sExpectedResult);
	}

}
