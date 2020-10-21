package pe.unjfsc.daw.spring5.model;

import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEProducto;

public class CDLoadData {
	private static final Logger LOG = LoggerFactory.getLogger("CDLoadData");
	private HashSet<CEProducto> oListProduct;
	
	public CDLoadData() {
		loadProducto();
	}
	
	public HashSet<CEProducto> loadProducto(){
		oListProduct.add(new CEProducto(10, "Bebidas", "Gasesosa", "Retornable", "Coca cola", "1.5 lt", 6.00));
		oListProduct.add(new CEProducto(15, "Bebidas", "Gasesosa", "Retornable", "Coca cola", "1.0 lt", 3.50));
		oListProduct.add(new CEProducto(20, "Bebidas", "Gasesosa", "No retornable", "Coca cola", "500 ml", 2.50));
		oListProduct.add(new CEProducto(25, "Bebidas", "Gasesosa", "Retornable", "Inka kola", "500 ml", 2.50));
		oListProduct.add(new CEProducto(30, "Bebidas", "Gasesosa", "No retornable", "Inka kola", "2 lt", 6.50));
		oListProduct.add(new CEProducto(35, "Licores", "Cervezas", "Botella", "Pilsen", "650 ml", 6.50));
		oListProduct.add(new CEProducto(40, "Licores", "Cervezas", "Botella", "Cristal", "650 ml", 6.50));
		oListProduct.add(new CEProducto(45, "Lacteos", "Formula de crecimiento", "Nan3", "Nestle", "Liquida", 3.70));
		oListProduct.add(new CEProducto(50, "Lacteos", "Formula lactea", "Nan2", "Nestle", "Liquida", 4.30));
		LOG.info("[EVL] Load List Product : {}", oListProduct.size() );
		return oListProduct;
	}

	public void setoListProduct(HashSet<CEProducto> oListProduct) {
		this.oListProduct = oListProduct;
	}
	
}
