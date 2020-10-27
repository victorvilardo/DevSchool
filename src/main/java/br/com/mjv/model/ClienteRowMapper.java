package br.com.mjv.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClienteRowMapper implements RowMapper<Cliente>{

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {

		Cliente cliente = new Cliente ();
		
		cliente.setAgencia(rs.getInt("agencia"));
		cliente.setConta(rs.getInt("conta"));
		cliente.setCpf(rs.getString("cpf"));
		cliente.setId(rs.getInt("id"));
		cliente.setNome(rs.getString("nome"));
		cliente.setSaldo(rs.getDouble("saldo"));
		cliente.setUsuario(rs.getString("usuario"));
		
		
		return cliente;
	}

}
