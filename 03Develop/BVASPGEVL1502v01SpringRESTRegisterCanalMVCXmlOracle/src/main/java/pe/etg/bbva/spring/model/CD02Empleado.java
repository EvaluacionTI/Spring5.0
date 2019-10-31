package pe.etg.bbva.spring.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import pe.etg.bbva.spring.entity.CE02Empleado;

public class CD02Empleado {
	private JdbcTemplate moJdbcTemplate;

	public void setTemplate(JdbcTemplate poTemplate) {
		this.moJdbcTemplate = poTemplate;
	}

	public int grabaCanal(CE02Empleado p){
		String sql="INSERT INTO APXt05_empleado(id, txt_nombre, mto_salario, txt_cargo) VALUES('"+p.getId()+"',"+p.getName()+",'"+p.getSalary()+",'"+p.getDesignation()+"')";
		return moJdbcTemplate.update(sql);
	}
	
	public int actualizaCanal(CE02Empleado p){
		String sql="UPDATE APXt05_empleado set txt_nombre='"+p.getName()+"', mto_salario="+p.getSalary()+", txt_cargo='"+p.getDesignation()+"' WHERE id="+p.getId()+"";
		return moJdbcTemplate.update(sql);
	}
	public int eliminaCanal(int id){
		String sql="DELETE FROM APXt05_empleado WHERE id="+id+"";
		return moJdbcTemplate.update(sql);
	}

	public CE02Empleado getCanalById(int id){
		String sql="SELECT * FROM APXt05_empleado WHERE id=?";
		return moJdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<CE02Empleado>(CE02Empleado.class));
	}
	public List<CE02Empleado> getEmployees(){
		return moJdbcTemplate.query("SELECT * FROM APXt05_empleado",new RowMapper<CE02Empleado>(){
			public CE02Empleado mapRow(ResultSet rs, int row) throws SQLException {
				CE02Empleado e=new CE02Empleado();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				
				return e;
			}
		});
	}	
}
