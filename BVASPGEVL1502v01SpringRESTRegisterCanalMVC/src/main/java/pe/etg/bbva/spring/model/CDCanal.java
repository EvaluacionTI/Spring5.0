package pe.etg.bbva.spring.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import pe.etg.bbva.spring.entity.CECanal;

public class CDCanal {
	private JdbcTemplate moJdbcTemplate;

	public void setTemplate(JdbcTemplate poTemplate) {
		this.moJdbcTemplate = poTemplate;
	}

	public int grabaCanal(CECanal p){
		String sql="INSERT INTO APXt01_canal(id, cod_canal, txt_abrv, txt_desc) VALUES('"+p.getId()+"',"+p.getCodigo()+",'"+p.getAbreviatura()+",'"+p.getDescripcion()+"')";
		return moJdbcTemplate.update(sql);
	}
	
	public int actualizaCanal(CECanal p){
		String sql="UPDATE APXt01_canal set cod_canal='"+p.getCodigo()+"', txt_abrv="+p.getAbreviatura()+", txt_desc='"+p.getDescripcion()+"' WHERE id="+p.getId()+"";
		return moJdbcTemplate.update(sql);
	}
	public int eliminaCanal(int id){
		String sql="DELETE FROM APXt01_canal WHERE id="+id+"";
		return moJdbcTemplate.update(sql);
	}

	public CECanal getCanalById(int id){
		String sql="SELECT * FROM APXt01_canal WHERE id=?";
		return moJdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<CECanal>(CECanal.class));
	}
	public List<CECanal> getEmployees(){
		return moJdbcTemplate.query("SELECT * FROM APXt01_canal",new RowMapper<CECanal>(){
			public CECanal mapRow(ResultSet rs, int row) throws SQLException {
				CECanal e=new CECanal();
				e.setId(rs.getInt(1));
				e.setCodigo(rs.getString(2));
				e.setAbreviatura(rs.getString(3));
				e.setDescripcion(rs.getString(4));
				
				return e;
			}
		});
	}
}
