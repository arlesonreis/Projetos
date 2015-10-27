package br.edu.nassau.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.nassau.dao.DaoProjetoImpl;
import br.edu.nassau.modelo.Projeto;
import br.edu.nassau.modelo.Usuario;

/**
 * Servlet implementation class CadastroProjetoServlet
 */
@WebServlet("/CadastroProjetoServlet")
public class CadastroProjetoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DaoProjetoImpl DaoProjeto;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroProjetoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	DaoProjeto = new DaoProjetoImpl();
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
		String responsavel = request.getParameter("responsavel");
		String descricao = request.getParameter("descricao");
		
		Projeto pr = new Projeto();
		//us.setId(id);
		pr.setNome(nome);
		pr.setResponsavel(responsavel);
		pr.setDescricao(descricao);
		
		
		try {
			DaoProjeto.save(pr);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
		
	}


