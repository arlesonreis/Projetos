package br.edu.nassau.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.nassau.dao.DaoUsuario;
import br.edu.nassau.dao.DaoUsuarioImpl;
import br.edu.nassau.modelo.Usuario;

/**
 * Servlet implementation class CadastroUsuarioServlet
 */
@WebServlet("/CadastroUsuarioServlet")
public class CadastroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DaoUsuarioImpl DaoUsuario;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		DaoUsuario = new DaoUsuarioImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Integer id = Integer.valueOf(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String funcao = request.getParameter("funcao");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Usuario us = new Usuario();
		//us.setId(id);
		us.setNome(nome);
		us.setSobrenome(sobrenome);
		us.setFuncao(funcao);
		us.setEmail(email);
		us.setSenha(senha);
		
		try {
			DaoUsuario.save(us);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
