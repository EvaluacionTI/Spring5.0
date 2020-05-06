package pe.bbva.spring5.evalua.modulo.inventario;

import java.io.Serializable;
import java.util.List;

import pe.bbva.spring5.evalua.modulo.inventario.entity.CE02Product;

public interface CI02ProductManager extends Serializable{

	public void increasePrice(int percentage);
    public List<CE02Product> getProducts();
}
