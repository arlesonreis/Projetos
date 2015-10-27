package br.edu.nassau.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.UpdatableResultSet;

import br.edu.nassau.modelo.Projeto;
import br.edu.nassau.modelo.Usuario;
import br.edu.nassau.dao.DaoProjeto;
import br.edu.nassau.dao.GenericDao;

public class DaoProjetoImpl extends GenericDao implements DaoProjeto {

	@Override
	public void save(Projeto projeto) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO projetos (nome, responsavel, descricao) VALUES (?,?,?)";
		PreparedStatement st = null;
		try {

			openConn();
			st = conn.prepareStatement(sql);
			st.setString(1, projeto.getNome());
			st.setString(2, projeto.getResponsavel());
			st.setString(3, projeto.getDescricao());

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
	public void update(Projeto projeto) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE projetos SET nome=?, responsavel=?, descricao=? WHERE id=?";
		PreparedStatement st = null;

		try {

			openConn();
			st = conn.prepareStatement(sql);
			st.setString(1, projeto.getNome());
			st.setString(2, projeto.getResponsavel());
			st.setString(3, projeto.getDescricao());
			st.setInt(4, projeto.getId());

			st.execute();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			st.close();
			closeConn();
		}
		
	}

	@Override
	public void remove(Projeto projeto) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "DELETE from projetos WHERE id = ?";
		PreparedStatement st = null;

		try {
			openConn();
			st = conn.prepareStatement(sql);
			st.setInt(1, projeto.getId());

			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			st.close();
			closeConn();
		}
		
	}

	@Override
	public Projeto get(int idGet) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM projetos WHERE id = ?";
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
	public List<Projeto> list() throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<Projeto> lista = new ArrayList<Projeto>();

		Statement st = null;
		ResultSet rs = null;

		try {
			openConn();
			st = conn.createStatement();
			String sql = "SELECT * FROM projetos ";
			rs = st.executeQuery(sql);

			while (rs.next()) {

				Projeto projeto = new Projeto();
				projeto.setId(rs.getInt(1));
				projeto.setNome(rs.getString(2));
				projeto.setResponsavel(rs.getString(3));
				projeto.setDescricao(rs.getString(4));
				lista.add(projeto);
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