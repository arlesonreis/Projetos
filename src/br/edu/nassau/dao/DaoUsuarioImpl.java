package br.edu.nassau.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.nassau.modelo.Usuario;
import br.edu.nassau.dao.DaoUsuario;
import br.edu.nassau.dao.GenericDao;

public class DaoUsuarioImpl extends GenericDao implements DaoUsuario {

	public void save(Usuario usuario) throws SQLException {
		String sql = "INSERT INTO usuarios (nome, sobrenome, funcao, email, senha) VALUES (?,?,?,?,?)";
		PreparedStatement st = null;
		try {

			openConn();
			st = conn.prepareStatement(sql);
			st.setString(1, usuario.getNome());
			st.setString(2, usuario.getSobrenome());
			st.setInt(3, usuario.getFuncao());
			st.setString(4, usuario.getEmail());
			st.setString(5, usuario.getSenha());

			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (st != null)
				st.close();
			closeConn();
		}
	}

	public void update(Usuario usuario) throws SQLException {
		String sql = "UPDATE usuarios SET nome=?, login=?, senha=? WHERE id=?";
		PreparedStatement st = null;

		try {

			openConn();
			st = conn.prepareStatement(sql);
			st.setString(1, usuario.getNome());
			st.setString(2, usuario.getSobrenome());
			st.setInt(3, usuario.getFuncao());
			st.setString(4, usuario.getEmail());
			st.setString(5, usuario.getSenha());
			st.setInt(6, usuario.getId());

			st.execute();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			st.close();
			closeConn();
		}

	}

	public void remove(Usuario usuario) throws SQLException {
		String sql = "DELETE from usuarios WHERE id = ?";
		PreparedStatement st = null;

		// Implemente a lógica do código aqui!

		try {
			openConn();
			st = conn.prepareStatement(sql);
			st.setInt(1, usuario.getId());

			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			st.close();
			closeConn();
		}

	}

	public Usuario get(int idGet) throws SQLException {
		String sql = "SELECT * FROM usuarios WHERE id = ?";
		PreparedStatement st = null;

		// Implemente a lógica do código aqui!

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

	public List<Usuario> list() throws SQLException {

		ArrayList<Usuario> lista = new ArrayList<Usuario>();

		Statement st = null;
		ResultSet rs = null;

		try {
			openConn();
			st = conn.createStatement();
			String sql = "SELECT * FROM usuarios ";
			rs = st.executeQuery(sql);

			while (rs.next()) {

				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt(1));
				usuario.setNome(rs.getString(2));
				usuario.setSobrenome(rs.getString(3));
				usuario.setFuncao(rs.getInt(4));
				usuario.setEmail(rs.getString(5));
				usuario.setSenha(rs.getString(6));
				lista.add(usuario);
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
