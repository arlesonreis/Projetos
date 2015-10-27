package br.edu.nassau.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.nassau.dao.DaoFuncaoImpl;
import br.edu.nassau.modelo.Funcao;
import br.edu.nassau.modelo.Projeto;

/**
 * Servlet implementation class CadastroFuncaoServlet
 */
@WebServlet("/CadastroFuncaoServlet")
public class CadastroFuncaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DaoFuncaoImpl DaoFuncao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroFuncaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	DaoFuncao = new DaoFuncaoImpl();
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
		
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		
		Funcao fu = new Funcao();
		//us.setId(id);
		fu.setNome(nome);
		fu.setDescricao(descricao);
		
		
		try {
			DaoFuncao.save(fu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

