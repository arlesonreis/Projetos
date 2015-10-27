package br.edu.nassau.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.nassau.modelo.Funcao;
import br.edu.nassau.modelo.Projeto;
import br.edu.nassau.modelo.Usuario;

public class DaoFuncaoImpl extends GenericDao implements DaoFuncao{

	@Override
	public void save(Funcao funcao) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO funcoes (nome, descricao) VALUES (?,?)";
		PreparedStatement st = null;
		try {

			openConn();
			st = conn.prepareStatement(sql);
			st.setString(1, funcao.getNome());
			st.setString(2, funcao.getDescricao());

			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (st != null)
				st.close();
			closeConn();
		}
		
	}

	@Override
	public void update(Funcao funcao) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE funcoes SET nome=?, descricao=? WHERE id=?";
		PreparedStatement st = null;

		try {

			openConn();
			st = conn.prepareStatement(sql);
			st.setString(1, funcao.getNome());
			st.setString(2, funcao.getDescricao());
			st.setInt(3, funcao.getId());

			st.execute();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			st.close();
			closeConn();
		}
		
	}

	@Override
	public void remove(Funcao funcao) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "DELETE from funcoes WHERE id = ?";
		PreparedStatement st = null;

		try {
			openConn();
			st = conn.prepareStatement(sql);
			st.setInt(1, funcao.getId());

			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			st.close();
			closeConn();
		}
		
		
	}

	@Override
	public Funcao get(int idGet) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM funcoes WHERE id = ?";
		PreparedStatement st = null;

		try {
			openConn();
			st = conn.prepareStatement(sql);
			st.setInt(1, idGet);

			st.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			st.close();
			closeConn();
		}
		return null;
		
	}

	@Override
	public List<Funcao> list() throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<Funcao> lista = new ArrayList<Funcao>();

		Statement st = null;
		ResultSet rs = null;

		try {
			openConn();
			st = conn.createStatement();
			String sql = "SELECT * FROM funcoes ";
			rs = st.executeQuery(sql);

			while (rs.next()) {

				Funcao funcao = new Funcao();
				funcao.setId(rs.getInt(1));
				funcao.setNome(rs.getString(2));
				funcao.setDescricao(rs.getString(3));
				lista.add(funcao);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return lista;
	}

}

