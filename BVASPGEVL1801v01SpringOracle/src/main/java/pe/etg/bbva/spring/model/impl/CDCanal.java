package pe.etg.bbva.spring.model.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.etg.bbva.spring.entity.CECanal;
import pe.etg.bbva.spring.model.CICanal;

@Repository
public class CDCanal implements CICanal<CECanal> {

	private DataSource moDataSource;
	private JdbcTemplate moJdbcTemplate;
	
	@PostConstruct
	private void postConstruct() {
		moJdbcTemplate = new JdbcTemplate(moDataSource);

	}

	@Override
	public void saveCanal(CECanal poCECanal) {
		String sComandSQL = "INSERT INTO CTAt01_canal VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		moJdbcTemplate.update(sComandSQL, poCECanal.getCod_canal(), poCECanal.getCod_empresa(), poCECanal.getCod_iso_idio_orgn(),
				poCECanal.getTxt_abrv(), poCECanal.getTxt_desc(), poCECanal.getSn_ver(), poCECanal.getSn_upd(), poCECanal.getSn_anu(),
				poCECanal.getSn_del(), poCECanal.getSn_dflt(), poCECanal.getSn_act(), poCECanal.getTxt_usr(), poCECanal.getFec_sis());

	}

	@Override
	public CECanal loadCanal(String psCodigoCanal) {
		String sComandoSQL = "SELECT * FROM CTAt01_canal WHERE cod_canal =  ?";
		
		List<CECanal> oCECanales = moJdbcTemplate.query(sComandoSQL, 
				new Object[] {psCodigoCanal}, (resultSet, i)->{
					return toCanal(resultSet);
				});

        if (oCECanales.size() == 1) {
            return oCECanales.get(0);
        }
		return null;
	}

	@Override
	public void deleteCanal(String psCodigoCanal) {
		String sComandoSQL = "DELETE FROM CTAt01_canal WHERE cod_canal = ? ";
		
		moJdbcTemplate.update(sComandoSQL, psCodigoCanal);
	}

	@Override
	public List<CECanal> loadAllCanal() {
		String sComandoSQL = "SELECT * FROM CTAt01_canal";
		
		return moJdbcTemplate.query(sComandoSQL, (resultSet ,i)->{
			return toCanal(resultSet);
		});
	}

	private CECanal toCanal(ResultSet poResultSet) throws SQLException {
		CECanal oCECanal = new CECanal();
		
		oCECanal.setCod_canal(poResultSet.getString("cod_canal"));
		oCECanal.setCod_empresa(poResultSet.getString("cod_empresa"));
		oCECanal.setCod_iso_idio_orgn(poResultSet.getString("cod_iso_idio_orgn"));
		oCECanal.setTxt_abrv(poResultSet.getString("txt_abrv"));
		oCECanal.setTxt_desc(poResultSet.getString("txt_desc"));
		oCECanal.setSn_ver(poResultSet.getString("sn_ver"));
		oCECanal.setSn_upd(poResultSet.getString("sn_upd"));
		oCECanal.setSn_anu(poResultSet.getString("sn_anu"));
		oCECanal.setSn_del(poResultSet.getString("sn_del"));
		oCECanal.setSn_dflt(poResultSet.getString("sn_dflt"));
		oCECanal.setSn_act(poResultSet.getString("sn_act"));
		oCECanal.setTxt_usr(poResultSet.getString("txt_usr"));
		oCECanal.setFec_sis(poResultSet.getDate("fec_sis"));
		
		return oCECanal;
	}
}
