package br.edu.nassau.dao;

import java.sql.SQLException;
import java.util.List;

import br.edu.nassau.modelo.Funcao;
import br.edu.nassau.modelo.Projeto;
import br.edu.nassau.modelo.Usuario;

public interface DaoFuncao {
	
	public void save(Funcao funcao) throws SQLException;

	public void update(Funcao funcao) throws SQLException;

	public void remove(Funcao funcao) throws SQLException;

	public Funcao get(int id) throws SQLException;

	public List<Funcao> list() throws SQLException;

}
