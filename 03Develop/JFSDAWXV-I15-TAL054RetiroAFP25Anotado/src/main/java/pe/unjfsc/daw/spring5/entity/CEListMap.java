package pe.unjfsc.daw.spring5.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("idCEListMap")
public class CEListMap {
	private Map<String, String> map;
	private List<String> list;
	
	public CEListMap() {
		map = new HashMap<String, String>();
		map.put("afiliado1", "Esteban");
		map.put("afiliado2", "Mery");
		map.put("afiliado3", "Illari");
 
		list = new ArrayList<String>();
		list.add("Paula");
		list.add("Chabelo");
		list.add("Torito");
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
}
