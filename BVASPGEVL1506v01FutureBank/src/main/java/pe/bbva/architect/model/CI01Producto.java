package pe.bbva.architect.model;

import java.util.List;

public interface CI01Producto<T> {
	void saveProducto(T poT);
	void updateProducto(T poT);
	void deleteProducto(int piIdProducto);
	List<T> loadAllProducto();
	T loadProductoById(int piIdProducto);
}
