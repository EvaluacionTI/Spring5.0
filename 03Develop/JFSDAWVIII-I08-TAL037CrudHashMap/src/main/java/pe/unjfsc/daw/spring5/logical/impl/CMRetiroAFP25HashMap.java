package pe.unjfsc.daw.spring5.logical.impl;

import java.util.HashMap;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.CIRetiroAFP25;

public class CMRetiroAFP25HashMap implements CIRetiroAFP25{
	private static final Logger LOG = LoggerFactory.getLogger("CMRetiroAFP25HashMap");
	
	private HashMap<String, CESaldoAfiliado> moHashAreaLateral;
	private CESaldoAfiliado moCESaldoAfilidado;
	
	public CMRetiroAFP25HashMap() {
		moHashAreaLateral = new HashMap<String, CESaldoAfiliado>();
		
		moHashAreaLateral.put("A01", new CESaldoAfiliado(1, "2000", 27500.05));
		moHashAreaLateral.put("A02", new CESaldoAfiliado(2, "2000", 27500.05));
		moHashAreaLateral.put("A03", new CESaldoAfiliado(3, "2000", 92500.05));
		moHashAreaLateral.put("A04", new CESaldoAfiliado(4, "2000", 82500.05));
		moHashAreaLateral.put("A05", new CESaldoAfiliado(5, "2000", 72500.05));
		moHashAreaLateral.put("A06", new CESaldoAfiliado(6, "2000", 62500.05));
		moHashAreaLateral.put("A07", new CESaldoAfiliado(7, "2000", 52500.05));
		moHashAreaLateral.put("A08", new CESaldoAfiliado(8, "2000", 42500.05));
		moHashAreaLateral.put("A09", new CESaldoAfiliado(9, "2000", 32500.05));
		moHashAreaLateral.put("A10", new CESaldoAfiliado(10, "2000", 22500.05));
		moHashAreaLateral.put("A11", new CESaldoAfiliado(11, "2000", 12500.05));
		LOG.info("[EVL] HashMap : {}", moHashAreaLateral.size());
	}
	
	public void saveRetiro(String psCodigoMap, CESaldoAfiliado poLSA) {
		if (moHashAreaLateral.containsKey(psCodigoMap)) {
			LOG.info("[EVL] Código de Map repetido : {}", psCodigoMap);
		}else {
			moHashAreaLateral.put(psCodigoMap, new CESaldoAfiliado(poLSA.getId(), poLSA.getCodigoAfiliado(), poLSA.getSaldoCIC()));			
		}
	}

	public void updateRetiro(String psCodigoMap, CESaldoAfiliado poLSA) {
		if (moHashAreaLateral.containsKey(psCodigoMap)) {
			moHashAreaLateral.put(psCodigoMap, new CESaldoAfiliado(poLSA.getId(), poLSA.getCodigoAfiliado(), poLSA.getSaldoCIC()));
		}else {
			LOG.info("[EVL] Código de Map no existe : {}", psCodigoMap);
		}
	}

	public void deleteRetiro(String psCodigoMap) {
		if (moHashAreaLateral.containsKey(psCodigoMap)) {
			moHashAreaLateral.remove(psCodigoMap);
		}else {
			LOG.info("[EVL] Código de Map no existe : {}", psCodigoMap);
		}
	}

	public HashMap<String, CESaldoAfiliado> consultAll() {
		LOG.info("[EVL] consultAll : {}", moHashAreaLateral.size());
		return moHashAreaLateral;
	}

	public CESaldoAfiliado consultaById(int pId) {
		String key_found="";
		Iterator<String> it = moHashAreaLateral.keySet().iterator();
		
		while(it.hasNext()) {
			key_found = it.next();
			if(moHashAreaLateral.get(key_found).getId()==pId) {
				moCESaldoAfilidado.setId(moHashAreaLateral.get(key_found).getId());
				moCESaldoAfilidado.setCodigoAfiliado(moHashAreaLateral.get(key_found).getCodigoAfiliado());
				moCESaldoAfilidado.setSaldoCIC(moHashAreaLateral.get(key_found).getSaldoCIC());
			}
		}
		LOG.info("[EVL] Afiliado found : {}", moCESaldoAfilidado);
		return moCESaldoAfilidado;
	}

	public void setMoCESaldoAfilidado(CESaldoAfiliado moCESaldoAfilidado) {
		this.moCESaldoAfilidado = moCESaldoAfilidado;
	}
}
