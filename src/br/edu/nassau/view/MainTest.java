package br.edu.nassau.view;

import java.sql.SQLException;

import br.edu.nassau.dao.DaoUsuario;
import br.edu.nassau.dao.DaoUsuarioImpl;
import br.edu.nassau.modelo.Usuario;

public class MainTest {
	
	public static void main(String[] args) {
		Usuario u = new Usuario();
		
		u.setId(1);
		u.setNome("sasda");
		u.setSobrenome("asdsadf");
		u.setFuncao("sdasd");
		u.setEmail("sadsafd");
		u.setSenha("sadasdf");
		
		DaoUsuario Conn = new DaoUsuarioImpl();
		
		try {
			Conn.save(u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
