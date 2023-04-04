package br.edu.ifgoiano.entidade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/cadastrousuario")
public class controleServlet extends HttpServlet {

	//simulando banco de dados 
	
	private List<usuario>lstDeUsuario;
	
	@Override
	public void init() throws ServletException {
		this.lstDeUsuario= new ArrayList<usuario>();	}
	
	
	
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 String senha = req.getParameter("senha");
	 String senha2 = req.getParameter("senha2");
	 
	 if (senha.equals(senha2)) {
		 usuario usu = new usuario();
		 usu.setNome(req.getParameter("nome"));
		 usu.setEmail(req.getParameter("email"));
		 usu.setSenha(senha);
		 resp.sendRedirect("Index.html");
		 
	 }else {
		 req.getRequestDispatcher("cadastroWeb.html").forward(req, resp);

	}
	 
}

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			for (usuario usuario : lstDeUsuario) {
				System.out.println(usuario.getNome().concat("-").concat(usuario.getEmail()));
				
				
			}
		
		}
		
		//apaga os elementos da lista 
		@Override
		public void destroy() {
			this.lstDeUsuario.clear();
		}
}


	 

