package pe.bbva.architect.model.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.bbva.architect.entity.CE03Cuenta;
import pe.bbva.architect.model.CI03Cuenta;

@Repository
public class CD03Cuenta implements CI03Cuenta<CE03Cuenta>{
	private DataSource moDataSource;
	private JdbcTemplate moJdbcTemplate;

	@PostConstruct
	private void postConstruct() {
		moJdbcTemplate = new JdbcTemplate(moDataSource);
	}
	
	@Override
	public void saveCuente(CE03Cuenta poT) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CE03Cuenta loadCuenta(int piIdCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCuenta(int piIdCuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CE03Cuenta loadCuentaById(int piIdCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CE03Cuenta> loadAllCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

}
