package br.edu.ifgoiano.entidade;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastrousuario")
public class controlarServelet extends HttpServlet {
  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String senha = req.getParameter("senha");
		 String senha2 = req.getParameter("senha2");
		 
		 
		 if (senha.equals(senha2)) {
			 usuario usu = new usuario();
			 usu.setNome(req.getParameter("name"));
			 usu.setEmail(req.getParameter("email"));
			 usu.setSenha(senha);
			
			 resp.sendRedirect("Index.html");
			 
		 }else {
			 req.getRequestDispatcher("cadastroweb").forward(req, resp);
		 }
	}
	
}
