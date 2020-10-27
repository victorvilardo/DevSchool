package br.com.mjv.bank.dao;

import br.com.mjv.model.Cliente;
import br.com.mjv.model.ClienteRowMapper;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class ClienteDaoImpl implements ClienteDao {

	
	private NamedParameterJdbcTemplate template;
	
	@Override
	public Cliente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	
	public Cliente buscarClienteUsuario (String usuario) {
		
		String sql = "SELECT * FROM TB_CLIENTE WHERE usuario = :usuario";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("usuario", usuario);
		
		Cliente  cliente = template.queryForObject(sql, params, new ClienteRowMapper());
		
		return cliente;
		
	}
	
}
