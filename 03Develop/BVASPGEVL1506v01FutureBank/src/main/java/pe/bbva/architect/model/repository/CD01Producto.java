package pe.bbva.architect.model.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.bbva.architect.entity.CE01Producto;
import pe.bbva.architect.model.CI01Producto;
import pe.etg.bbva.spring.entity.CECanal;

@Repository
public class CD01Producto implements CI01Producto<CE01Producto>{
	private DataSource moDataSource;
	private JdbcTemplate moJdbcTemplate;
	
	@PostConstruct
	private void postConstruct() {
		moJdbcTemplate = new JdbcTemplate(moDataSource);
	}
	
	@Override
	public void saveProducto(CE01Producto poT) {
		String sComandSQL = "INSERT INTO APXt05_producto VALUES (?, ?)";
		
		moJdbcTemplate.update(sComandSQL, poT.getIdProducto(), poT.getDescripcion());
	}

	@Override
	public void updateProducto(CE01Producto poT) {
		String sComandSQL = "UPDATE APXt05_producto SET txt_nom_prod = ? WHERE id_producto = ?";
		
		moJdbcTemplate.update(sComandSQL, poT.getDescripcion(), poT.getIdProducto());
	}

	@Override
	public void deleteProducto(int piIdProducto) {
		String sComandoSQL = "DELETE FROM APXt05_producto WHERE id_producto = ? ";
		
		moJdbcTemplate.update(sComandoSQL, piIdProducto);
		
	}

	@Override
	public List<CE01Producto> loadAllProducto() {
		String sComandoSQL = "SELECT * FROM APXt05_producto";
		
		return moJdbcTemplate.query(sComandoSQL, (resultSet ,i)->{
			return getAllProducto(resultSet);
		});
	}

	@Override
	public CE01Producto loadProductoById(int piIdProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	private CE01Producto getAllProducto(ResultSet poResultSet) throws SQLException {
		CE01Producto oCEProducto = new CE01Producto();
		
		oCEProducto.setIdProducto(poResultSet.getInt("id_producto"));
		oCEProducto.setDescripcion(poResultSet.getString("txt_nom_prod"));
		
		return oCEProducto;
	}
}
