package br.edu.nassau.dao;

import java.sql.SQLException;
import java.util.List;

import br.edu.nassau.modelo.Atividade;
import br.edu.nassau.modelo.Funcao;
import br.edu.nassau.modelo.Usuario;

public interface DaoAtividade {

	public void save(Atividade atividade) throws SQLException;

	public void update(Atividade atividade) throws SQLException;

	public void remove(Atividade atividade) throws SQLException;

	public Usuario get(Atividade atividade) throws SQLException;

	public List<Atividade> list() throws SQLException;

}
