package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsuarioBean;
import model.UsuarioDao;


/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		String acao = request.getParameter("acao");
		if (acao.equals("buscar")){
			try {
				UsuarioBean usuarioBean = new UsuarioBean();
				usuarioBean.setNome(request.getParameter("acao"));
				
				UsuarioDao usuarioDao = new UsuarioDao();
				String resultado = usuarioDao.buscarUsuario(usuarioBean);
				response.getWriter().append(resultado);
			} catch (Exception e) {			
				e.printStackTrace();
				response.getWriter().append("Ocorreu o seguinte erro: " + e.getMessage());
			}
		}
		
		
		
		UsuarioBean usuarioBean = new UsuarioBean();
		
		usuarioBean.setNome(request.getParameter("nome"));
		usuarioBean.setEmail(request.getParameter("email"));
		usuarioBean.setSenha(request.getParameter("senha"));
		usuarioBean.setPerfil(request.getParameter("perfil"));
		usuarioBean.setStatus(request.getParameter("status"));
				
		UsuarioDao usuarioDao = new UsuarioDao();
		
		try {
			usuarioDao.inserirUsuario(usuarioBean);
			response.getWriter().append("Produto inserido com sucesso!");
		} catch (Exception e) {			
			e.printStackTrace();
			response.getWriter().append("Ocorreu o seguinte erro: " + e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
