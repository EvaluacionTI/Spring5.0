package pe.bbva.architect.model.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.bbva.architect.entity.CE02Cliente;
import pe.bbva.architect.model.CI02Cliente;

@Repository
public class CD02Cliente implements CI02Cliente<CE02Cliente> {
	private DataSource moDataSource;
	private JdbcTemplate moJdbcTemplate;
	
	@Override
	public void saveCliente(CE02Cliente poT) {
		String sComandSQL = "INSERT INTO APXt06_cliente VALUES (?, ?, ?)";
		
		moJdbcTemplate.update(sComandSQL, poT.getIdCliente(), poT.getNumeroDocumento(), poT.getNombrePersona());
	}

	@Override
	public CE02Cliente loadCliente(int piIdCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCliente(int piIdCliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CE02Cliente> loadAllCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CE02Cliente loadClienteById(int piIdCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
