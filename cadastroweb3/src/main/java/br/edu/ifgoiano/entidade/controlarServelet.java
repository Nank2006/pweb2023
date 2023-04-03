package br.edu.ifgoiano.entidade;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



	@WebServlet("/cadastrousuario")
	public class controlarServelet extends HttpServlet {
		
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
				 req.getRequestDispatcher("cadastroweb.html").forward(req, resp);
			 }
		}
		
	}


