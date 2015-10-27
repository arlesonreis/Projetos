package br.edu.nassau.dao;

import java.sql.SQLException;
import java.util.List;

import br.edu.nassau.modelo.Projeto;
import br.edu.nassau.modelo.Usuario;

public interface DaoProjeto {
	
	public void save(Projeto projeto) throws SQLException;

	public void update(Projeto projeto) throws SQLException;

	public void remove(Projeto projeto) throws SQLException;

	public Projeto get(int id) throws SQLException;

	public List<Projeto> list() throws SQLException;


}
