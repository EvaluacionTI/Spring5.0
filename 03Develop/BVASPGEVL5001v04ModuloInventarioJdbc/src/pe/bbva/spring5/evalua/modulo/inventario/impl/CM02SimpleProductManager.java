package pe.bbva.spring5.evalua.modulo.inventario.impl;

import java.util.List;

import pe.bbva.spring5.evalua.modulo.inventario.CI02ProductManager;
import pe.bbva.spring5.evalua.modulo.inventario.entity.CE02Product;

public class CM02SimpleProductManager implements CI02ProductManager {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<CE02Product> products;
	
	@Override
	public void increasePrice(int percentage) {
		if (products != null) {
            for (CE02Product product : products) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }
		
	}

	@Override
	public List<CE02Product> getProducts() {
		return products;
	}

	public void setProducts(List<CE02Product> products) {
		this.products = products;
	}

}
