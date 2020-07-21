package pe.bbva.evalua.spring5.model.impl;

import java.util.HashMap;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.CIRetiroAFP25HashMap;

public class CDRetiroAFP25HashMap implements CIRetiroAFP25HashMap{
	private static final Logger LOG = LoggerFactory.getLogger("CDRetiroAFP25HashMap");
	private HashMap<String, CESaldoAfiliadoCustom> moListAfiliado;
	private CESaldoAfiliadoCustom moCESaldoAfiliado;
	
	public CDRetiroAFP25HashMap() {
		moListAfiliado = new HashMap<>();
		
		moListAfiliado.put("A01", new CESaldoAfiliadoCustom(1, "2000", 2500.05));
		moListAfiliado.put("A02", new CESaldoAfiliadoCustom(2, "2001", 3500.10));
		moListAfiliado.put("A03", new CESaldoAfiliadoCustom(3, "2002", 4500.15));
		moListAfiliado.put("A04", new CESaldoAfiliadoCustom(4, "2003", 5500.20));
		moListAfiliado.put("A05", new CESaldoAfiliadoCustom(5, "2004", 6000.25));
		moListAfiliado.put("A06", new CESaldoAfiliadoCustom(6, "2005", 6500.30));
		moListAfiliado.put("A07", new CESaldoAfiliadoCustom(7, "2006", 7000.35));
		moListAfiliado.put("A08", new CESaldoAfiliadoCustom(8, "2007", 7500.40));
		moListAfiliado.put("A09", new CESaldoAfiliadoCustom(9, "2008", 8000.45));
		moListAfiliado.put("A10", new CESaldoAfiliadoCustom(10, "2009", 8500.50));
		moListAfiliado.put("A11", new CESaldoAfiliadoCustom(11, "2010", 9000.55));
		moListAfiliado.put("A12", new CESaldoAfiliadoCustom(12, "2011", 9500.60));
		moListAfiliado.put("A12", new CESaldoAfiliadoCustom(13, "2012", 10500.70));
		moListAfiliado.put("A13", new CESaldoAfiliadoCustom(14, "2013", 11500.80));
		moListAfiliado.put("A14", new CESaldoAfiliadoCustom(15, "2014", 12500.90));
		moListAfiliado.put("A15", new CESaldoAfiliadoCustom(16, "2015", 13500.99));
		moListAfiliado.put("A16", new CESaldoAfiliadoCustom(17, "2016", 14500.98));
		moListAfiliado.put("A17", new CESaldoAfiliadoCustom(18, "2017", 15500.97));
		moListAfiliado.put("A18", new CESaldoAfiliadoCustom(19, "2018", 16500.96));
		moListAfiliado.put("A19", new CESaldoAfiliadoCustom(20, "2019", 17500.95));
		moListAfiliado.put("A20", new CESaldoAfiliadoCustom(21, "2020", 18500.94));
	}
	
	@Override
	public void saveRetiroHashMap(String psCodigoMap, CESaldoAfiliadoCustom poCESaldoAfiliado) {
		
		if(moListAfiliado.containsKey(psCodigoMap)){
			LOG.info("[EVL] El código del Map repetido");
		}else{
			LOG.info("[EVL] Before insert List HashMap : {}", moListAfiliado);
			moListAfiliado.put("A"+poCESaldoAfiliado.getId(), poCESaldoAfiliado);
			LOG.info("[EVL] After insert List HashMap : {}", moListAfiliado);
		};
		
	}

	@Override
	public void updateRetiroHashMap(String psCodigoMap, CESaldoAfiliadoCustom poCESaldoAfiliado) {
		if (moListAfiliado.containsKey(psCodigoMap)) {
			LOG.info("[EVL] Before Update List HashMap : {}", moListAfiliado);
			LOG.info("[EVL] El código del Map se ha actualizado");
			moListAfiliado.put(psCodigoMap, new CESaldoAfiliadoCustom(poCESaldoAfiliado.getId(), poCESaldoAfiliado.getCodigoAfiliado(), poCESaldoAfiliado.getSaldoCIC()));
			LOG.info("[EVL] Update List HashMap : {}", moListAfiliado);
		}else {
			LOG.info("[EVL] No existe el Map");
		}
	}

	@Override
	public void deleteRetiroHahMap(String psCodigoMap) {
		if (moListAfiliado.containsKey(psCodigoMap)) {
			LOG.info("[EVL] Before List HashMap : {}", moListAfiliado);
			LOG.info("[EVL] El código del Map ha sido removido");
			moListAfiliado.remove(psCodigoMap);
			LOG.info("[EVL] New List HashMap : {}", moListAfiliado);
		}else {
			LOG.info("[EVL] No existe el Map");
		}
	}

	@Override
	public HashMap<String, CESaldoAfiliadoCustom> consultaAllRetiroHashMap() {
		LOG.info("[EVL HasMap {}", moListAfiliado);
		return moListAfiliado;
	}

	@Override
	public CESaldoAfiliadoCustom consultaByIdRetiroHashMap(int pid) {
		String key_found;
		Iterator<String> it = moListAfiliado.keySet().iterator();
		moCESaldoAfiliado = new CESaldoAfiliadoCustom();
		
		LOG.info("[EVL] Identificador : {}", pid);
		LOG.info("[EVL] Key found     : {}", it);

		while(it.hasNext()) {
			key_found = it.next();
			if (moListAfiliado.get(key_found).getId()==pid) {
				moCESaldoAfiliado.setId(moListAfiliado.get(key_found).getId());
				moCESaldoAfiliado.setCodigoAfiliado(moListAfiliado.get(key_found).getCodigoAfiliado());
				moCESaldoAfiliado.setSaldoCIC(moListAfiliado.get(key_found).getSaldoCIC());
				LOG.info("afiliado HashMap {}", moCESaldoAfiliado);
				break;
			}
		}
		return moCESaldoAfiliado;
	}
}
